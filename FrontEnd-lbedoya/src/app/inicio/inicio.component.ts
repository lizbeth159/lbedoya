import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html'
})
export class InicioComponent implements OnInit {

  title: string = "WELCOME TO PAGE INICIO";

  constructor() { }

  ngOnInit(): void {
  }

}
