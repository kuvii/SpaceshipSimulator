# SpaceshipSimulator

#### 1 Objetivo 
Implementa una clase de tipo SpaceShip. Incluye en ella, como mínimo, los siguientes atributos: 
- Nombre.
- Matrícula galáctica.
- Aceleración.
- Velocidad X.
- Velocidad Y.
- Coordenada X.
- Coordenada Y.
- Dirección X
- Dirección Y

#### 2 Objetivo

La clase SpaceShip debe incluir un método denominado speedUp que calcule la nueva velocidad y posición de la nave espacial después de haber aplicado a la velocidad actual la aceleración correspondiente

#### 3 Objetivo

Sobrecarga el método toString de la clase SpaceShip para que muestre una representación AsciiArt de la misma. Como ejemplos inspiradores les dejo los siguientes enlaces: 

https://www.asciiart.eu/space/spaceships  
https://ascii.co.uk/art/spaceships

#### 4 Objetivo

Crea un directorio docs que cuelgue de la raíz del proyecto y dentro de él, crea un nuevo documento MarkDown denominado SpaceShip.md donde tendrás que explicar el funcionamiento de tu clase SpaceShip, incluyendo las referencias de las páginas webs que hayas utilizado para obtener información sobre el cálculo de la velocidad y posición. Enlaza este documento desde el Readme.md

[SpaceShipInfo.md](https://github.com/kuvii/SpaceshipSimulator/blob/main/main/SpaceShipInfo.md)

#### 5 Objetivo

Crea un nuevo método que se denomine brake y que lo que haga sea hacer que la nave frene aplicando la misma aceleración pero en sentido contrario.

#### 6 Objetivo
Crea un nuevo método que se denomine emergencyStop, que lo que haga es que la velocidad de la nave pase a ser cero inmediatamente.

#### 7 Objetivo
Crea una nueva clase denominada Cargo que extienda a la anterior. Esta clase debe incluir un nuevo atributo que represente la capacidad de carga máxima. Entendemos la capacidad de carga de una nave de tipo Cargo como el número de containers máximos que puede transportar.

#### 8 Objetivo

11 Crea un método denominado load() que añada un container a la bodega de una nave de tipo Cargo si aún hay espacio y que muestre un mensaje de error en el caso de que ya no quepa un nuevo container en la misma.

#### 9 Objetivo

Crea un método denominado unload() que elimine un container de la bodega de carga de una nave de tipo Cargo si hay alguno almacenado allí. En caso contrario debe mostrar un mensaje de aviso indicando que no puede descargarse porque no hay containers almacenados allí.

#### 10 Objetivo

Crea un nuevo documento en la carpeta docs de tu proyecto y denomínalo Cargo.md, procede como en el caso anterior explica el funcionamiento de tu clase Cargo así como cualquier referencia que hayas utilizado en este caso. Enlaza este nuevo documento desde el archivo Readme.md.

[Cargo.md](https://github.com/kuvii/SpaceshipSimulator/blob/main/main/src/Cargo.md)
#### 11 Objetivo

Por último, diseña una interfaz que permita al usuario crear una nueva nave, muestre su asciiArt correspondiente y permita que el usuario acelere, frene o pare. El usuario debe poder salir en cualquier momento de la aplicación.
