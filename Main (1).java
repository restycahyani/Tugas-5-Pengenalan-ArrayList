package com.company;

public class Main {

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Aku", "3923842934", true, true);
        System.out.println(manusia1.toString());
        Manusia manusia2 = new Manusia("Dian Nurita Hasanah", "251427182517", false, true);
        System.out.println(manusia2.toString());
        Manusia manusia3 = new Manusia("Hawa Mahira", "2635273823", false, false);
        System.out.println(manusia3.toString());
        System.out.println("");
        System.out.println("=========== DATA PEKERJA ===========");
        Pekerja pekerja1 = new Pekerja("Iqbal Biondy", "351717969","195102439283", true, true, 7, 22);
        Pekerja pekerja2 = new Pekerja("Riko Saputra", "356278373","182637254362", true, false, 8, 25);
        Pekerja pekerja3 = new Pekerja("Rani amandaa", "251672617","201725829162", false, true, 6, 20);
        System.out.println(pekerja1.toString());
        System.out.println(pekerja2.toString());
        System.out.println(pekerja3.toString());
        System.out.println("");
        System.out.println("=========== DATA MANAJER ===========");
        Manajer manajer1 = new Manajer("Lyra Hertin", "351707384392", "204837283728", false, false, 9, 20, 1500 );
        Manajer manajer2 = new Manajer("Herlambangg", "342537269387", "192362715372", true, true, 8, 24, 1200 );
        Manajer manajer3 = new Manajer("Tri Afirian", "261728715246", "216353728914", true, false, 7, 25, 1000 );
        System.out.println(manajer1.toString());
        System.out.println(manajer2.toString());
        System.out.println(manajer3.toString());
        System.out.println("");
        System.out.println("========== DATA MAHASISWA ==========");
        MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", true, false, "205150601111018", 3.7);
        MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("Dian Nurita", "317306620203", false, false, "215150600111028", 4.0);
        MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Alya Nurul W", "324516271821", false, true, "214637241728262", 3.4);
        System.out.println(mahasiswa1.toString());
        System.out.println(mahasiswa2.toString());
        System.out.println(mahasiswa3.toString());
    }
}
