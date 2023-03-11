import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../service/customer.service';
import {Router} from '@angular/router';
import {CustomerType} from '../model/customer-type';
import {Customer} from '../model/customer';
import {ToastrService} from 'ngx-toastr';
import {differenceInYears} from 'date-fns';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  createForm: FormGroup;
  customerTypes: CustomerType[] | undefined;

  compareWith(object1: Customer, object2: number): boolean {
    object2 = 1;
    console.log('1', object1);
    console.log('2', object2);
    return object1 ? object1.id === object2 : object1 === object2;
  }

  constructor(private customerService: CustomerService,
              private router: Router,
              private toastr: ToastrService
  ) {
    this.createForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern('[0-9]{0,5}')]),
      customerCode: new FormControl('', [Validators.required, Validators.pattern('KH-[0-9]{4}')]),
      name: new FormControl('', [Validators.required, Validators.pattern('([A-Z][a-z]+[ ])+([A-Z][a-z]+)')]),
      dateOfBirth: new FormControl('', [Validators.required, this.validateOfBirth]),
      idCard: new FormControl('', [Validators.required, Validators.pattern('([0-9]{9})$|^([0-9]{12})')]),
      phoneNumber: new FormControl('', [Validators.required, Validators.pattern('(((\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})')]),
      gender: new FormControl(),
      email: new FormControl('', [Validators.required, Validators.email]),
      address: new FormControl(),
      flagDelete: new FormControl(),
      customerType: new FormGroup({
        id: new FormControl(),
        name: new FormControl()
      })
    });
    this.customerService.getAllCusType().subscribe(data => {
      this.customerTypes = data;
    });
  }

  showSuccess(): any {
    this.toastr.success('Thêm mới thành công!', 'Notification');
  }

  ngOnInit(): void {
  }

  createCustomer(): Customer | any {
    const customer = this.createForm.value;
    this.customerService.saveCustomer(customer).subscribe(data => {
      this.createForm.reset();
      this.showSuccess();
      this.router.navigateByUrl('/customer');
    }, error => {
      this.toastr.error('Thêm mới không thành công', 'Notification');
    }, () => {
    });
  }

  validateOfBirth(c: AbstractControl): any {
    const date = new Date(c.value);
    const age = differenceInYears(new Date(), date);
    return (age <= 18) ? {greaterThan18: true} : null;
  }
}
