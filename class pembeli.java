//class pembeli
class pembeli {

    string makanan ;
    string minuman ;
    int jumlah ;
}

    pembeli (string makanan, string minuman, int jumlah) {
    this.makanan = makanan ;
    this.minuman = minuman ;
    this. jumlah = jumlah ;
}
void tampilkan () {
    system.out.println ("makanan : " + makanan) ;
    system.out.println ("minuman : " + minuman) ;
    system.out.println ("jumlah : " + jumlah) ;
}

//class kasir
class kasir {
    
    string id kasir ;
    string password kasir  ;
}

    kasir (string id kasir, string password kasir) {
    this.id kasir = id kasir ;
    this.password kasir = password kasir ;
}

void tampilkan () {
    system.out.println ("id kasir : " + id kasir) ;
    system.out.println ("password kasir : " + password kasir) ;
}


