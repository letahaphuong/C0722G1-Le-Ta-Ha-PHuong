import {Component, OnInit} from '@angular/core';
import {FacilityService} from '../service/facility.service';
import {Facility} from '../model/facility';

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {
  facilities: Facility[] = [];
  slideConfig = {slidesToShow: 4, slidesToScroll: 4};

  constructor(private facilityService: FacilityService) {
  }

  ngOnInit(): void {
    this.facilityService.getAll().subscribe(data => {
      this.facilities = data;
    });
  }


  breakpoint($event: { event: any; slick: any; breakpoint: any }): void {
    console.log('breakpoint');
  }

  slickInit($event: { event: any; slick: any }): void {
    console.log('slick initialized');
  }

  afterChange($event: { event: any; slick: any; currentSlide: number; first: boolean; last: boolean }): void {
    console.log('afterChange');
  }

  beforeChange($event: { event: any; slick: any; currentSlide: number; nextSlide: number }): void {
    console.log('beforeChange');
  }


}
