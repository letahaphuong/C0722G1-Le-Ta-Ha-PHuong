import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Facility} from '../model/facility';
import {FacilityType} from '../model/facility-type';
import {RentType} from '../model/rent-type';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  API_URL = 'http://localhost:8080/facilitys';
  APT_GET_FAC_TYPE = 'http://localhost:8080/faciliti-types';
  APT_GET_RENT_TYPE = 'http://localhost:8080/rent-types';


  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Facility[]> {
    return this.http.get<Facility[]>(this.API_URL);
  }

  getFacType(): Observable<FacilityType[]> {
    return this.http.get<FacilityType[]>(this.APT_GET_FAC_TYPE);
  }

  getRentType(): Observable<RentType[]> {
    return this.http.get<RentType[]>(this.APT_GET_RENT_TYPE);
  }
}
