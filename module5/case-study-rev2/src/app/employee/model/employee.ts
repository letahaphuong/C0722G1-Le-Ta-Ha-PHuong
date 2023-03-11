import {Division} from './division';
import {EducationDegree} from './education-degree';

export interface Employee {
  id: number;
  name?: string;
  dateOfBirth?: string;
  idCard?: string;
  salary?: number;
  phoneNumber?: string;
  email?: string;
  address?: string;
  position?: Position;
  division?: Division;
  educationDegree?: EducationDegree;
  flagDelete?: boolean;
}
