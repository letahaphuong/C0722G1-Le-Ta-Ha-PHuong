import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ContractDto} from '../model/contractDto';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  API_URL = 'http://localhost:8080/contracts';

  constructor(private http: HttpClient) {
  }

  getAllContract(): Observable<ContractDto[]> {
    return this.http.get<ContractDto[]>(this.API_URL);
  }

}
