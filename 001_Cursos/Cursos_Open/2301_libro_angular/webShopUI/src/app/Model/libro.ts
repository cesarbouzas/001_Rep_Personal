import { Categoria } from "./categoria"

export class Libro {
  idLibro: number;
  idCategoria: number;
  titulo:string;
  isbn: string;
  descripcion: string;
  autor: string;
  categoria: Categoria;
  precio: number;
  foto: string;

  constructor(idLibro: number,idCategoria: number,titulo:string,isbn: string,descripcion: string,
    autor: string,categoria: Categoria,precio: number,foto: string) {
      this.idLibro=idLibro;
      this.idCategoria=idCategoria;
      this.titulo=titulo;
      this.isbn=isbn;
      this.descripcion=descripcion;
      this.autor=autor;
      this.categoria=categoria;
      this.precio=precio;
      this.foto=foto;
    }
}
