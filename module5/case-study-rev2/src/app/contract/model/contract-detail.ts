import {AttachFacility} from './attach-facility';
import {Contract} from './contract';

export interface ContractDetail {
  id: number;
  contract: Contract;
  attachFacility: AttachFacility;
  quantity: number;
}
