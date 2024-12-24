package Service;

import Interface.Filter;
import org.example.Consignment8;
import org.example.PackedPieceProduct6;
import org.example.PackedWeightProduct5;

public class ProductService {

    public static int countByFilter(Consignment8 consignment, Filter filter) {
        int count = 0;

        // Проход по всем весовым товарам
        for (PackedWeightProduct5 weightProduct : consignment.getWeightProducts()) {
            if (filter.apply(weightProduct.getName())) { //Если фильтр возвращает true, увеличиваем счётчик
                count++;
            }
        }

        // Проход по всем штучным товарам
        for (PackedPieceProduct6 pieceProduct : consignment.getProducts()) {
            if (filter.apply(pieceProduct.getName())) {
                count++;
            }
        }

        return count;
    }
}
