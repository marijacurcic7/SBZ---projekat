
export class Zahtev {
    id: number;
    minCena: number;
    maxCena: number;
    razlog: string;
    motiv: string;
    datum: Date;
    

    constructor() {
        this.id = 0;
        this.minCena = 0;
        this.maxCena = 0;
        this.razlog = '';
        this.motiv = '';
        this.datum = new Date();
    }
}