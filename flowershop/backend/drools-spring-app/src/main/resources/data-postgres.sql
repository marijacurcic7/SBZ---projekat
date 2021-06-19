insert into authority (name) values ('ROLE_USER');
insert into authority (name) values ('ROLE_ADMIN');

insert into public.kupac (id, first_name, last_name, email, password, ukupna_cena, popust) values 
    (nextval('person_seq'), 'Ime', 'Prezime', 'kupac1@gmail.com', '$2a$10$smy7Eo0CdCrhcjYe8lAOMeMoxqeGTHGilpNcOiAAMUQR0F.5EVmHG', 0, 0);

insert into public.platform_admin (id, first_name, last_name, email, password) values 
    (nextval('person_seq'), 'Admin', 'Admin', 'admin@gmail.com', '$2a$10$smy7Eo0CdCrhcjYe8lAOMeMoxqeGTHGilpNcOiAAMUQR0F.5EVmHG');

insert into public.kupac (id, first_name, last_name, email, password, ukupna_cena, popust) values 
    (nextval('person_seq'), 'Marija', 'Curcic', 'kupac2@gmail.com', '$2a$10$smy7Eo0CdCrhcjYe8lAOMeMoxqeGTHGilpNcOiAAMUQR0F.5EVmHG', 0, 0);

insert into user_authority (user_id, authority_id) values (1, 1);
insert into user_authority (user_id, authority_id) values (2, 2);
insert into user_authority (user_id, authority_id) values (3, 1);

-- INSERT INTO public.platform_admin (user_id, username, password) VALUES (1, 'admin', 'admin');

-- INSERT INTO public.kupac (user_id, username, password) VALUES (1, 'kupac1', '123');
-- INSERT INTO public.kupac (user_id, username, password) VALUES (2, 'kupac2', '123');

INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (1, 'ruza', 'crvena', 'BLAG');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (2, 'ruza', 'bela', 'BLAG');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (3, 'ruza', 'zuta', 'BLAG');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (4, 'ruza', 'roze', 'BLAG');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (5, 'kala', 'crvena', 'BLAG');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (6, 'kala', 'bela', 'BLAG');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (7, 'kala', 'roze', 'BLAG');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (8, 'narcis', 'bela', 'NEMA');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (9, 'narcis', 'zuta', 'NEMA');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (10, 'hortenzija', 'plava', 'NEMA');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (11, 'hortenzija', 'bela', 'NEMA');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (12, 'perunika', 'plava', 'JAK');
INSERT INTO public.cvet (id, naziv, boja, miris) VALUES (13, 'hrizantema', 'zuta', 'NEMA');


INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (1, 'ZIMA');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (1, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (1, 'LETO');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (1, 'JESEN');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (2, 'ZIMA');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (2, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (2, 'LETO');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (2, 'JESEN');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (3, 'ZIMA');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (3, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (3, 'LETO');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (3, 'JESEN');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (4, 'ZIMA');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (4, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (4, 'LETO');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (4, 'JESEN');

INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (5, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (5, 'LETO');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (6, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (6, 'LETO');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (7, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (7, 'LETO');

INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (8, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (9, 'PROLECE');

INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (10, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (10, 'JESEN');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (11, 'PROLECE');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (11, 'JESEN');

INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (12, 'PROLECE');

INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (13, 'JESEN');
INSERT INTO cvet_sezone (cvet_id, sezone) VALUES (13, 'ZIMA');



INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (1, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (1, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (1, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (1, 'SAKSIJSKO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (2, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (2, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (2, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (2, 'VENAC');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (3, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (3, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (3, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (4, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (4, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (4, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (5, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (5, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (5, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (5, 'VENAC');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (6, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (6, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (6, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (6, 'VENAC');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (7, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (7, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (7, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (7, 'VENAC');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (8, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (8, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (9, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (9, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (10, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (10, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (10, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (10, 'SAKSIJSKO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (11, 'REZANO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (11, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (11, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (11, 'SAKSIJSKO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (12, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (12, 'SAKSIJSKO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (13, 'SAKSIJSKO_CVECE');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (13, 'ARANZMAN');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (13, 'BUKET');
INSERT INTO cvet_tipovi_proizvoda (cvet_id, tipovi_proizvoda) VALUES (13, 'VENAC');


INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (1, 'ljubav');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (1, 'postovanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (1, 'Dan zena');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (2, 'pomen');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (2, 'vencanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (2, 'postovanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (2, 'zahvalnost');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (2, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (3, 'prijateljstvo');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (3, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (4, 'prijateljstvo');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (4, 'zahvalnost');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (4, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (5, 'vencanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (5, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (5, 'pomen');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (5, 'ljubav');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (6, 'vencanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (6, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (6, 'pomen');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (6, 'porodica');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (7, 'vencanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (7, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (7, 'pomen');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (7, 'porodica');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (8, 'postovanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (8, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (8, 'poseta');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (8, 'dom');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (9, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (9, 'poseta');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (9, 'dom');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (9, 'prijateljstvo');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (10, 'porodica');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (10, 'dom');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (10, 'poseta');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (11, 'porodica');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (11, 'dom');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (11, 'poseta');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (11, 'vencanje');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (12, 'slava');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (12, 'dom');
INSERT INTO cvet_simbolika (cvet_id, simbolika) VALUES (13, 'pomen');


INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (1, 2, 8); -- 8 belih ruza
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (2, 1, 5);
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (3, 7, 3);
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (4, 3, 9); -- 9 zutih ruza
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (5, 1, 5); -- 5 crvenih ruza
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (6, 2, 5); -- 5 belih ruza
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (7, 6, 7); -- 7 belih kali
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (8, 8, 7); -- 7 belih narcisa
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (9, 9, 7); -- 7 zutih narcisa
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (10, 2, 12); -- 12 belih ruza
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (11, 1, 1); -- 1 crvena ruza
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (12, 10, 1); -- 1 plava hortenzija
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (13, 11, 3); -- 3 bele hortenzije
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (14, 10, 3); -- 3 plave hortenzije
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (15, 12, 3); -- 3 plave perunike
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (16, 12, 4); -- 4 plave perunike
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (17, 6, 3); -- 3 bele kale
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (18, 6, 6); -- 6 bele kale
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (19, 13, 8); -- 8 hrizanteme
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (20, 13, 8); -- 8 hrizanteme
INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (21, 2, 8); -- 8 belih ruza
-- INSERT INTO broj_vrsta (id, cvet_id, broj) VALUES (21, 2, 4); -- 4 bele ruze





INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (1, 'Bele ruze', 'opis', 'BUKET', 3000.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (2, 'Crvene ruze', 'opis', 'BUKET', 1600.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (3, 'Roze kale', 'opis', 'BUKET', 1600.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (4, 'Zute ruze', 'opis', 'REZANO_CVECE', 1500.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (5, 'Bele kale', 'opis', 'BUKET', 2200.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (6, 'Bele i crvene ruze', 'opis', 'ARANZMAN', 2500.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (7, 'Bele ruze', 'opis', 'VENAC', 5100.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (8, 'Crvena ruza', 'opis', 'REZANO_CVECE', 800.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (9, 'Beli narcisi', 'opis', 'REZANO_CVECE', 1200.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (10, 'Bele ruze', 'opis', 'BUKET', 1500.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (11, 'Zuti narcisi', 'opis', 'REZANO_CVECE', 1200.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (12, 'Plava hortenzija', 'opis', 'SAKSIJSKO_CVECE', 2000.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (13, 'Plava hortenzija', 'opis', 'REZANO_CVECE', 2000.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (14, 'Bela hortenzija', 'opis', 'BUKET', 2500.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (15, 'Perunika', 'opis', 'SAKSIJSKO_CVECE', 2500.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (16, 'Bele kale i perunike', 'opis', 'ARANZMAN', 3200.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (17, 'Hrizanteme', 'opis', 'BUKET', 2000.0, 0.0);
INSERT INTO public.proizvod (id, naziv, opis, tip, cena, popust) VALUES (18, 'Bele kale i hrizanteme', 'opis', 'VENAC', 5000.0, 0.0);


INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (1, 1);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (2, 2);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (3, 3);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (4, 4);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (5, 7);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (6, 5);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (6, 21);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (7, 10);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (8, 11);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (10, 6);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (9, 8);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (11, 9);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (12, 12);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (13, 14);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (14, 13);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (15, 15);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (16, 16);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (16, 17);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (17, 20);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (18, 18);
INSERT INTO proizvod_cvece (proizvod_id, cvece_id) VALUES (18, 19);

