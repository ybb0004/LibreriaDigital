package com.youssefbenavente.libreriadigital;



public class Libro  {
    private String titulo;
    private String autor;
    private String genero;
    private int anio;
    private String sinopsis;
    private String urlFoto;

    public Libro(String titulo, String autor, String genero, int anio, String sinopsis, String urlFoto) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.urlFoto = urlFoto;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    
    

    @Override
    public String toString() {
        return titulo + " - " + autor; // Formato de visualización en la lista
    }
}

