package com.example.recetario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recetas> recetas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recetas1 = new ArrayList<>();
        recetas1.add(new Recetas("Salmon a la Naranja","2 naranjas\n" +
                "1/2 tazas de mantequilla, fundida\n" +
                "1/4 tazas de chile chipotle molido\n" +
                "1/2 tazas de miel\n" +
                "1 cucharada de aceite de oliva\n" +
                "600 gramos de salmón, en lonja y sin piel\n" +
                "suficiente de perejil, para decorar","Preparación",
                "Sobre una tabla, saca la ralladura de una de las naranjas y córtala en medias lunas. Exprime la otra para sacar el jugo y reserva.\n" +
                        "En un bowl mezcla la mantequilla con el jugo de naranja, la ralladura de naranja, el chipotle molido y la miel.\n" +
                        "Cocina en un sartén con el aceite de oliva el salmón previamente sal pimentado y vierte la mezcla anterior, barniza constantemente y continúa la cocción hasta que esté cocido. A los ¾ de la cocción, agrega las medias lunas de naranja, reservando algunas para decorar.\n" +
                        "Sirve, decora con naranja y hojas de perejil.",R.drawable.salmon));

        recetas1.add(new Recetas("Fetuccine al Vodka","5 litros de agua, para cocer la pasta\n" +
                "suficiente de sal, para cocer la pasta\n" +
                "1 paquete de Fettuccine De Luigi® , 500 g\n" +
                "1/4 tazas de aceite de oliva, para la salsa\n" +
                "1/4 cebollas, finamente picada, para la salsa\n" +
                "4 dientes de ajo, para la salsa\n" +
                "4 jitomates, escalfados, para la salsa\n" +
                "1 taza de vodka, para la salsa\n" +
                "1/2 tazas de puré de tomate, para la salsa\n" +
                "1 cucharada de hojuela de chile, para la salsa\n" +
                "suficiente de sal, para la salsa\n" +
                "suficiente de pimienta, para la salsa\n" +
                "1 taza de crema para batir, para la salsa\n" +
                "1/2 tazas de queso parmesano, para la salsa\n" +
                "al gusto de albahaca, para decorar\n" +
                "al gusto de queso parmesano, para acompañar\n" +
                "al gusto de ensalada, para acompañar","Preparación","\n" +
                "Calienta el agua en una olla profunda y una vez que rompa el hervor, agrega Fettuccine De Luigi ® y cocina de 7 a 9 minutos. Escurre y reserva.\n" +
                "Calienta el aceite de oliva en una sartén a fuego medio y sofríe la cebolla, el ajo, los jitomates. Posteriormente, vierte el vodka y flamea por 5 minutos.\n" +
                "Procesa los ingredientes utilizando un procesador de mano o brazo hasta obtener una salsa tersa. Finalmente, agrega, el puré de tomate, las hojuelas de chile, la sal, la pimienta, la crema, el queso parmesano y el Fettuccine De Luigi ®. Cocina la salsa por 2 minutos.\n" +
                "Sirve el fettuccine al vodka en un plato hondo y decora con albahaca.",R.drawable.fetuccine));
        recetas1.add(new Recetas("Cacerola de pasta con pavo","suficiente de agua, para la pasta\n" +
                "suficiente de sal, para la pasta\n" +
                "1 paquete de Fettuccine Barilla®, 500 g\n" +
                "1/3 tazas de mantequilla, para engrasar\n" +
                "1 taza de Salsa Barilla® Parmesano\n" +
                "3 tazas de pavo ahumado, cocido y cortado en pedazos medianos\n" +
                "1 taza de queso parmesano, rallado\n" +
                "1 1/2 tazas de queso manchego, rallado\n" +
                "al gusto de orégano fresco, para decorar","Preparación",
                "Calienta el agua en una olla a fuego medio alto. Cuando hierva, añade suficiente sal y el Fettuccine Barilla®. Cocina conforme a las instrucciones del paquete. Escurre la pasta y reserva.\n" +
                        "Engrasa un refractario con suficiente mantequilla y añade el Fettuccine Barilla®, la Salsa Barilla® Parmesano, el pavo ahumado, el queso parmesano y el queso manchego. Integra de forma envolvente.\n" +
                        "Hornea la cacerola de pasta a 180° C por 5 minutos o hasta que el queso se gratine.\n" +
                        "Decora la cacerola de pasta con pavo con orégano y disfruta.",R.drawable.cacerola));
        recetas1.add(new Recetas("Trompo al pastor de res","3 chiles guajillos, hidratado\n" +
                "1 chile ancho, hidratado\n" +
                "1 chile chipotle, hidratado\n" +
                "1/2 tazas de achiote, líquido\n" +
                "1/4 cebollas, asada\n" +
                "1 rebanada de piña, asada\n" +
                "2 dientes de ajo, asado\n" +
                "1 taza de jugo de piña\n" +
                "3 cucharadas de vinagre de manzana\n" +
                "3 pimienta gorda\n" +
                "1 cucharadita de comino\n" +
                "1 cucharada de sal\n" +
                "1 cucharadita de orégano seco\n" +
                "1 kilo de rib eye, en lonchas\n" +
                "1 taza de cebolla, cortada en cuadros para el trompo\n" +
                "1 piña, un cubo grande para colocar en la parte de abajo y arriba del trompo\n" +
                "2 cucharadas de mantequilla, para la cebolla caramelizada con piña\n" +
                "2 tazas de cebolla, fileteada, para la cebolla caramelizada con piña\n" +
                "3 cucharadas de jugo sazonador, para la cebolla caramelizada con piña\n" +
                "3 cucharadas de salsa worcestershire, para la cebolla caramelizada con piña\n" +
                "3 cucharadas de jugo de limón, para la cebolla caramelizada con piña\n" +
                "1/2 tazas de piña, para la cebolla caramelizada con piña\n" +
                "1/4 tazas de azúcar, para la cebolla caramelizada con piña\n" +
                "1 diente de ajo, asado para la salsa de tuétano\n" +
                "1/8 cebollas, asada para la salsa de tuétano\n" +
                "2 pimienta gorda, para la salsa de tuétano\n" +
                "al gusto de sal de grano, para la salsa de tuétano\n" +
                "5 tomates verdes, asado para la salsa de tuétano\n" +
                "1 chile habanero, asado para la salsa de tuétano\n" +
                "1/4 tazas de cilantro, para la salsa de tuétano\n" +
                "1/4 tazas de tuétano, cocido, para la salsa de tuétano\n" +
                "3 cucharadas de jugo de limón, para la salsa de tuétano\n" +
                "tortillas de maíz, taqueras\n" +
                "Modelo® Ámbar, para acompañar","Preparación",
                "Precalienta el horno a 200 °C.\n" +
                        "Licúa los chiles previamente hidratados con el achiote líquido, la cebolla, la piña y el ajo asado, el vinagre de manzana, el jugo de piña, la pimienta gorda, el comino, la sal y el orégano seco.\n" +
                        "Mezcla en un recipiente la carne con la salsa de achiote y marina por 1 hora en refrigeración.\n" +
                        "En una charola para horno, coloca un trozo de piña e inserta un palo de madera para formar la base y sostener el trompo, intercala toda la carne con la cebolla para simular el trompo y coloca otro trozo de piña hasta arriba para finalizar.\n" +
                        "Tapa con papel aluminio y hornea 40 minutos a 200 °C. Una vez transcurrido el tiempo, retira el papel aluminio y vuelve a hornear por 20 minutos a 200 °C. Voltea constantemente para que la cocción sea pareja y se dore.\n" +
                        "Para la cebolla caramelizada con piña, en un sartén cocina la cebolla con la mantequilla, el jugo sazonador, la salsa Worcestershire, el jugo de limón, la piña y el azúcar por 10 minutos, o hasta que se caramelice.\n" +
                        "Para la salsa de tuétano, muele en un molcajete el ajo asado, la cebolla asada, la pimienta gorda, la sal de grano, el tomate verde asado, el chile habanero asado, el cilantro, el tuétano y el jugo de limón hasta integrar todos los ingredientes.\n" +
                        "Sirve en tacos, con tortilla de maíz, la cebolla caramelizada y la salsa de tuétano. Decora y acompaña con Modelo® Ámbar, disfruta.",R.drawable.pastor));
        recetas1.add(new Recetas("Taco de pulpo con adobo dulce","1 cabeza de ajo, para cocinar el pulpo\n" +
                "1/2 cebollas, para cocinar el pulpo\n" +
                "3 hojas de laurel, para cocinar el pulpo\n" +
                "al gusto de sal, para cocinar el pulpo\n" +
                "1 pulpo, mediano (500g), limpio\n" +
                "2 jitomates, tatemados, para el adobo\n" +
                "2 dientes de ajo, tatemados, para el adobo\n" +
                "1/4 cebollas, tatemada, para el adobo\n" +
                "2 chiles pasilla, hidratados, para el adobo\n" +
                "3 chiles guajillos, hidratados, para el adobo\n" +
                "3 chiles de árbol, hidratados, para el adobo\n" +
                "4 chiles chipotles, secos, hidratados, para el adobo\n" +
                "1 taza de cilantro, para el adobo\n" +
                "1 cucharadita de orégano, para el adobo\n" +
                "1 cucharada de mostaza, para el adobo\n" +
                "1 cucharada de vinagre de manzana, para el adobo\n" +
                "3 cucharadas de mantequilla, para el adobo\n" +
                "3 cucharadas de Azúcar Mascabado Domino®, para el adobo\n" +
                "1 cucharada de sal, para el adobo\n" +
                "suficiente de tortilla\n" +
                "al gusto de cilantro, picado finamente\n" +
                "suficiente de cebolla cambray, fileteada con todo y tallos, encurtida con habaneros, para acompañar\n" +
                "suficiente de papa cambray, para acompañar\n" +
                "suficiente de chile güero, tatemados, para acompañar\n" +
                "suficiente de limón, para acompañar","Preparación",
                "Para cocinar el pulpo , calienta una olla con abundante agua, agrega suficiente sal (como agua de mar), la cebolla, el laurel y la cabeza de ajo; una vez que ha hervido, introduce el Pulpo sosteniéndolo de la cabeza por 3 segundos, retira y repite esta operación 2 veces más, permitiendo que el agua vuelva a hervir en cada ocasión antes de hacer la inmersión del pulpo. Una vez realizada esta operación, deja el pulpo dentro, tapa la olla y deja cocinar por 50 minutos; retira del agua y reserva.\n" +
                        "Corta el pulpo en partes, los tentáculos, la parte de la cabeza y el tronco.\n" +
                        "Para el adobo, licúa el jitomate, el ajo, la cebolla, los chiles pasilla, guajillo, de árbol y de chipotle, el cilantro, el orégano, la mostaza y el vinagre de manzana, puedes agregar un poco del agua del remojo de los chiles si es necesario.\n" +
                        "Calienta una olla y agrega la mantequilla, agrega Azúcar Mascabado Domino®, agrega el pulpo y cocina por 3 minutos, vierte el adobo, agrega sal y cocina por 3 minutos hasta reducir ligeramente y que se concentren los sabores.\n" +
                        "Arma los tacos con tortillas calientes, el pulpo adobado, los cebollines encurtidos con habanero y cilantro; acompaña con chiles güeros, papas cambray y limones.",R.drawable.pulpo));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recetas1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
