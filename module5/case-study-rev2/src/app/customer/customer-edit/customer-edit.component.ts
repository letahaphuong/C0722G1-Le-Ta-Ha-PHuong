import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../service/customer.service';
import {Customer} from '../model/customer';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerType} from '../model/customer-type';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customer: Customer | null = {id: 0};
  customerTypes: CustomerType[] | undefined;
  customerType: CustomerType = {};
  editForm: FormGroup = new FormGroup({
    id: new FormControl(),
    customerCode: new FormControl('', [Validators.required, Validators.pattern('KH-[0-9]{4}')]),
    name: new FormControl('', [Validators.required, Validators.pattern('([A-Z][a-z]+[ ])+([A-Z][a-z]+)')]),
    dateOfBirth: new FormControl(''),
    idCard: new FormControl('', [Validators.required, Validators.pattern('([0-9]{9})$|^([0-9]{12})')]),
    phoneNumber: new FormControl('', [Validators.required, Validators.pattern('(((\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})')]),
    gender: new FormControl(''),
    email: new FormControl('', [Validators.required, Validators.email]),
    address: new FormControl(''),
    flagDelete: new FormControl(''),
    customerType: new FormControl('')
  });

  constructor(private customerService: CustomerService,
              private activatedRoute: ActivatedRoute,
              private router: Router,
              private toastr: ToastrService
  ) {
    this.activatedRoute.paramMap.subscribe(data => {
      const id = data.get('id');
      if (id != null) {
        this.getCustomer(+id);
      }
    });

  }

  getCustomer(id: number): void {
    this.customerService.findById(id).subscribe(data => {
      console.log(data);
      this.editForm.patchValue(data);
      this.toastr.info('Truy cập dữ liệu đến server thành công', 'Notification');
    }, error => {
      this.toastr.error('Truy cập dữ liệu từ server không thành công', 'Notification');
    });
  }

  update(): any {
    const customerEdit = this.editForm.value;
    this.customerService.update(customerEdit).subscribe(data => {
      this.toastr.success('Cập nhật thành công', 'Notification');
    }, error => {
      this.toastr.error('Sửa không thành công', 'Notification');
      console.log(error);
    }, () => {
      this.router.navigateByUrl('/customer');
    });
  }

  get customerCode(): any {
    return this.editForm.get('customerCode');
  }

  get name(): any {
    return this.editForm.get('name');
  }

  get idCard(): any {
    return this.editForm.get('idCard');
  }

  get phoneNumber(): any {
    return this.editForm.get('phoneNumber');
  }

  get email(): any {
    return this.editForm.get('email');
  }

  ngOnInit(): void {
    this.customerService.getAllCusType().subscribe(data => {
      this.customerTypes = data;
    });
  }

  compareWith(object1: Customer, object2: Customer): boolean {
    console.log('id 1 nè:' + object1.id);
    console.log('id 2 nè:' + object2.id);
    return object1 && object2 ? object1.id === object2.id : object1 === object2;
  }
}
