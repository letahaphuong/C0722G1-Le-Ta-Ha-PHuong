import {Employee} from '../../employee/model/employee';
import {Customer} from '../../customer/model/customer';
import {Facility} from '../../facility/model/facility';

export interface ContractDto{
  id: number;
  startDate: string;
  endDate: string;
  deposit: number;
  nameCustomer: string;
  employeeName: string;
  nameFacility: string;
  totalValue: string;
}
