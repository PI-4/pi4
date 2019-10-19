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
    console.log(ELEMENT_DATA.length);
    console.log(ELEMENT_DATA);
    
    this.senhaPrioridade = new Senha();
    this.senhaPrioridade.tipo = 'Prioridade';
    this.senhaPrioridade.senha = this.ultSenha + 1;
    ELEMENT_DATA.push(this.senhaPrioridade);
    this.dataSource.data = ELEMENT_DATA;
    
    
  }

  criarNormal() {
    this.senhaNormal = new Senha();
    this.senhaNormal.tipo = 'Normal';
    this.senhaNormal.senha = this.ultSenha + 1;
    ELEMENT_DATA.push(this.senhaNormal);
    this.dataSource.data = ELEMENT_DATA;
    console.log(ELEMENT_DATA)
    
  }

  chamarSenha() {
    ELEMENT_DATA.forEach((element,index) => {
      if(element.tipo === 'Prioridade') {
        this.count +=1;
        this.senhaAtual = element.senha === 0?1:element.senha +1;
        this.senhaTipo = 'Prioridade';
        ELEMENT_DATA.splice(index,1);
        return element;
      }
      if (this.count > 0) {
        this.senhaAtual = element.senha === 0?1:element.senha +1;
        this.senhaTipo = 'Normal';
        ELEMENT_DATA.splice(index,1);
        return element;
      }
    });
    
    console.log(ELEMENT_DATA);
    this.dataSource.data = ELEMENT_DATA.filter(element => element !== undefined);;
  }

}
