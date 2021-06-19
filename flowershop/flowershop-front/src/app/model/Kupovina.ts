import { Proizvod } from "./Proizvod";

export class Kupovina {
    id: number;
    proizvod: Proizvod;
    datum: Date;
    iznos: number;
}