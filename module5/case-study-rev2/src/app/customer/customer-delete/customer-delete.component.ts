import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Customer} from '../model/customer';
import {CustomerService} from '../service/customer.service';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  @Input()
  customer: Customer = {id: 0};
  @Output()
  eventDelete = new EventEmitter();

  constructor(private customerService: CustomerService,
              private toastr: ToastrService
  ) {
  }

  ngOnInit(): void {
  }

  delete(): void {
    const id = this.customer.id;
    this.customerService.deleteById(id).subscribe(data => {
      this.eventDelete.emit();
      document.getElementById('exampleModal')?.click();
      this.toastr.success('Xoá thành công', 'Notification');
    }, error => {
      console.log(error);
    }, () => {
    });
  }
}
