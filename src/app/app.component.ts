import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource, MatPaginator } from '@angular/material';
import { element } from 'protractor';
import { empty } from 'rxjs';



export class Senha {
  senha: number = 0;
  tipo: string;

}

let ELEMENT_DATA: Senha[] = [];
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {


  senhaPrioridade:Senha;
  senhaNormal:Senha;
  displayedColumns: string[] = ['senha', 'tipo'];
  senhaAtual:any = 0;
  ultSenha:number = 0;
  count:number = 0;
  senhaTipo:any = 'nenhuma';
  dataSource:MatTableDataSource<Senha> = new MatTableDataSource();
  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;

  ngOnInit(): void {
    this.dataSource.paginator = this.paginator;


  }
  criarPrioridade() {


    this.senhaPrioridade = new Senha();
    this.senhaPrioridade.tipo = 'Prioridade';
    this.senhaPrioridade.senha = this.ultSenha + 1;
    this.ultSenha = this.senhaPrioridade.senha;
    ELEMENT_DATA.push(this.senhaPrioridade);
    this.dataSource.data = ELEMENT_DATA;


  }

  criarNormal() {
    this.senhaNormal = new Senha();
    this.senhaNormal.tipo = 'Normal';
    this.senhaNormal.senha = this.ultSenha + 1;
    this.ultSenha = this.senhaNormal.senha;
    ELEMENT_DATA.push(this.senhaNormal);
    this.dataSource.data = ELEMENT_DATA;

  }


  chamarSenha(prio:boolean) {
    const prioridade:Senha[] = ELEMENT_DATA.filter(element => element.tipo === 'Prioridade');
    const normal:Senha[] = ELEMENT_DATA.filter(element => element.tipo === 'Normal');
    console.log(prioridade)
    console.log(normal)
    ELEMENT_DATA.forEach((element,index) => {
      if(prioridade.length > 0 && prio && element.tipo === 'Prioridade') {
        this.count +=1;
        this.senhaAtual = element.senha;
        this.senhaTipo = 'Prioridade';
        ELEMENT_DATA.splice(index,1);


        prio = false;
        return element;
      }
       if (prioridade.length === 0) {
        this.senhaAtual = element.senha;
        this.senhaTipo = 'Normal';
        ELEMENT_DATA.splice(index,1);

        return element;
      }
    });

    console.log(ELEMENT_DATA);
    this.dataSource.data = ELEMENT_DATA.filter(element => element !== undefined);;
  }


  card() {
    if(this.senhaAtual === 'prioridade') {
      return 'cardPrioridade';
    } else {
      return 'card';
  }
}

}
