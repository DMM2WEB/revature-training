import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { ActivatedRoute } from "@angular/router";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: any[] = []
  catId: any;

  constructor(private dataService: DataService, private activateRoute: ActivatedRoute) {
    this.catId = this.activateRoute.snapshot.paramMap.get('catId')
   }

  ngOnInit(): void {
    this.dataService.getProductsByCatId(this.catId).subscribe(response => {
      this.products = response.data
    })
  }
}
