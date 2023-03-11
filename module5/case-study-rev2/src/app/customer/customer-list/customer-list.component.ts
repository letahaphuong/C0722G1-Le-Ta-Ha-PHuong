import {Component, OnInit} from '@angular/core';
import {Customer} from '../model/customer';
import {CustomerService} from '../service/customer.service';
import {CustomerType} from '../model/customer-type';
import {ToastrService} from 'ngx-toastr';
import {Observable} from 'rxjs';


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  customerTypes: CustomerType[] = [];
  temp: Customer = {id: 0};
  p = 1;
  searchText: any;
  name = '';
  email = '';
  customerType = '';

  constructor(private customerService: CustomerService,
              private toast: ToastrService
  ) {
    this.customerService.getAllCusType().subscribe(data => {
      this.customerTypes = data;
    }, error => {
      this.toast.error('Mất kết nối server', 'Notifination');
    });
  }

  ngOnInit(): void {
    this.getAll(this.name, this.email, this.customerType);
  }

  reload(): void {
    this.getAll(this.name, this.email, this.customerType);
  }

  getAll(name: string, email: string, customerType: string): void {
    this.customerService.getAll(name, email, customerType).subscribe(data => {
      this.customers = data;
    });
  }

  search(name: string, email: string, customerType: string): any {
    console.log('search nè' + customerType);
    this.getAll(name, email, customerType);
  }
}

