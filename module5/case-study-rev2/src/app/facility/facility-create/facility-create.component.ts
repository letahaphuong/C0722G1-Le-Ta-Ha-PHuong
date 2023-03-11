import {Component, OnInit} from '@angular/core';
import {FacilityService} from '../service/facility.service';
import {FacilityType} from '../model/facility-type';

@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {
  devices = 'one two three'.split(' ');
  selectedDevice = 'two';
  facilityTypes: FacilityType[] | undefined;

  constructor(private facilityService: FacilityService) {
  }

  ngOnInit(): void {
    this.facilityService.getFacType().subscribe(data => {
      this.facilityTypes = data;
    });
  }


  onChange(newValue: string) {
    alert('ok');
    console.log(newValue);
    this.selectedDevice = newValue;
  }
}
