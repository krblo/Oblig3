package com.example.oblig3;

public class Biletter {
        private int id;
        private String film;
        private String antall;
        private String fornavn;
        private String etternavn;
        private String tlf;
        private String epost;

        public Biletter(int id, String film, String antall, String fornavn, String etternavn, String tlf, String epost){
            this.id = id;
            this.film = film;
            this.antall = antall;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.tlf = tlf;
            this.epost = epost;
        }
        public Biletter(){}

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFilm() {
            return film;
        }

        public void setFilm(String film) {
            this.film = film;
        }

        public String getAntall() {
            return antall;
        }

        public void setAntall(String antall) {
            this.antall = antall;
        }

        public String getFornavn() {
            return fornavn;
        }

        public void setFornavn(String fornavn) {
            this.fornavn = fornavn;
        }

        public String getEtternavn() {
            return etternavn;
        }

        public void setEtternavn(String etternavn) {
            this.etternavn = etternavn;
        }

        public String getTlf() {
            return tlf;
        }

        public void setTlf(String tlf) {
            this.tlf = tlf;
        }

        public String getEpost() {
            return epost;
        }

        public void setEpost(String epost) {
            this.epost = epost;
        }
    }

