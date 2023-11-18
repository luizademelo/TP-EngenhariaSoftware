package com.sistema_esportivo.Utils;

import static com.sistema_esportivo.Utils.IOMethods.*;
import com.sistema_esportivo.Helpers.AirportHelper;
import com.sistema_esportivo.Helpers.HotelHelper;
import com.sistema_esportivo.Helpers.StadiumHelper;

public class LocationsPrinter {

    public static void printAllLocations() {
        print("ESTÁDIOS");
        StadiumHelper.printAllStadiums();
        printLine();
        print("HOTÉIS");
        HotelHelper.printAllHotels();
        printLine();
        print("AEROPORTOS");
        AirportHelper.printAllAirports();
        printLine();
    }
}
