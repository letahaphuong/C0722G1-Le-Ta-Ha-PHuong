import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer';
import {CustomerType} from '../model/customer-type';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  API_URL = 'http://localhost:8080/customer-list';
  API_GETCUSTYPE = 'http://localhost:3000/customer-type';

  constructor(private http: HttpClient) {
  }

  getAllCusType(): Observable<CustomerType[]> {
    return this.http.get<CustomerType[]>(this.API_GETCUSTYPE);
  }

  getAll(name: string, email: string, customerType: string): Observable<Customer[]> {
    console.log(customerType + ' => cus service');
    return this.http.get<Customer[]>('http://localhost:3000/customer?name_like=' + name + '&email_like=' + email + '&customerType.name_like=' + customerType);
  }

  deleteById(id: number): Observable<Customer> {
    return this.http.delete<Customer>(this.API_URL + '/' + id);
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>(this.API_URL, customer);
  }

  findById(id: number): Observable<Customer> {
    return this.http.get<Customer>(this.API_URL + '/' + id);
  }

  search(name: string, email: string, customerType: CustomerType): Observable<Customer[]> {
    return this.http.get<Customer[]>(this.API_URL + '/search' + '?' + name + '&&' + email + '&&' + customerType);
  }

  update(customerEdit: Customer): Observable<Customer> {
    return this.http.patch<Customer>(this.API_URL + '/' + customerEdit.id, customerEdit);
  }
}
