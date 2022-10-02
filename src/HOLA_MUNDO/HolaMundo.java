package HOLA_MUNDO;

import java.util.Scanner;


//JORGE LUIS ARONE DELGADO

 
public class HolaMundo {
         
        //VARIABLES VAR STRING Y INT
    static String Hola_mundo(){
        //variable de tipo entero
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        //modificamos el valor de la variable
        miVariableEntera = 2;
        System.out.println(miVariableEntera);

        //variable de tipo cadena
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        //modificamos el valor de la variable
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos en java 
        
        //var acepta enteros 
        int miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        //var acepta cadenas
        String miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //var acepta numeros reales 
        double reales = 1.7;
        System.out.println("reales = " + reales);
        return null;
    }
        //CONCATENACION CON JAVA union de variables
    static String Concatenacion(){
        String usuario = "juan";
        String titulo = "ingeniero";

        String union = titulo + " " + usuario;
        System.out.println("union = " + union);

        int i = 3;
        int j = 4;

        System.out.println(j + i + usuario);//ptimero es la suma despues la cadena 
        System.out.println(usuario + i + j);//primero la cadena pero no se realiza la suma 
        System.out.println(usuario + (i + j));//primero la cadena pero si se realiza la suma por los parentesis

        int union2 = i + j;
        System.out.println("union2 = " + union2);
        return null;
    }

        //CARACTERES ESPECIALES CON JAVA
    static String caracteres_especiales(){
        String nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);//El salto de linea con \n 
        System.out.println("Tabulador: \t" + nombre);//El tabulador que hace un espacio 
        System.out.println("Retroceso: \b" + nombre);//retroceso de un espacio 
        System.out.println("Comilla Simple: \'" + nombre + "\'");//Impresion de comillar simples a la variable Nom
        System.out.println("Comillas Dobles: \"" + nombre + "\"");//Impresion de comillar sobles a la variable
        return null;
    }
        //CLASE SCANNER COMO FUNCIONA ,LEER DATOS DE CARACTER DESDE LA CONSOLA 
    static String Clase_Scanner(){
        System.out.print("ESCRIBE TU NOMBRE: ");
        Scanner consola=new Scanner(System.in);//SE INDICA QUE VALOR A TRABAJAR CON LA CONSOLA(iniciamos sonsola) 
        String usuario = consola.nextLine();//LEE EL VALOR DE LA CONSOLA 
        System.out.println("usuario = " + usuario);
        System.out.print("ESCRIBE EL TITULO: ");
        String titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
        return null;
    }
        //TAREA SOBRE SCANNER 
    static String Tarea_Scanner(){
        System.out.print("Proporciona el titulo: ");
        Scanner consola=new Scanner(System.in);
        String titulo = consola.nextLine();
        System.out.print("Proporciona el autor: ");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        return null;
    }
    
        //TIPOS PRIMITIVOS(numeros enteros)
    
    static int tipos_primitivos(){
        /*
            Tipos primitivos enteros: byte 8bits, short 16bits, int 32bits, long 64bits 
        */
        byte numeroByte = (byte)129;//obligamos a declarar a tipo byte 
        System.out.println("Valor byte: " + numeroByte);//no nos dara el resultado deseado por que el tipo byte solo tiene un maximo de 127
        System.out.println("Valor minimo byte: "+Byte.MIN_VALUE);//valor minimo la cual puede almacenar el tipo byte
        System.out.println("Valor minimo byte: "+Byte.MAX_VALUE);//valor maximo la cual puede almacenar el tipo byte
        
        short numeroShort = (short)32768;//obligamos a declarar a tipo short
        System.out.println("\nnumeroShort = " + numeroShort);//no nos dara el resultado deseado por que el tipo short solo tiene un maximo de 32767
        System.out.println("Valor minimo short: "+Short.MIN_VALUE);//valor minimo la cual puede almacenar el tipo short
        System.out.println("Valor maximo short: "+Short.MAX_VALUE);//valor maximo la cual puede almacenar el tipo short
        
        int numeroInt = (int)2147483648L;//obligamos a declarar a tipo Long con la L 
        System.out.println("\nnumeroInt = " + numeroInt);//no nos dara el resultado deseado por que el tipo int solo tiene un maximo de 2147483647
        System.out.println("Valor minimo int: "+Integer.MIN_VALUE);//valor minimo la cual puede almacenar el tipo int 
        System.out.println("Valor maximo int: "+Integer.MAX_VALUE);//valor maximo la cual puede almacenar el tipo int 
        
        //long numeroLong = 9223372036854775807L;//Con la L declaramos que el tipo de Long 
        long numeroLong = (long)9223372036854775808F;//obligamos a declarar a tipo flotante con la letra F 
        System.out.println("\nnumeroLong = " + numeroLong);//no nos dara el resultado deseado por que el tipo Long  solo tiene un maximo de 9223372036854775807
        System.out.println("Valor minimo Long: "+Long.MIN_VALUE);//valor minimo la cual puede almacenar el tipo Long
        System.out.println("Valor maximo Long: "+Long.MAX_VALUE);//valor maximo la cual puede almacenar el tipo Long
        return 0;
    }
        //TIPOS PRIMITIVOS DE TIPO FLOTANTE(numeros reales)
    static float tipos_primitivos_de_tipo_flotante(){
        /*
            Tipos primitivos de tipo flotante: float 32bits y double 64bits 
        */
        float numeroFloat = (float) 3.4028235E38D;//obligamos a declarar a tipo double con la letra D
        System.out.println("\nnumeroFloat = " + numeroFloat);//no nos dara el resultado deseado por que el tipo Float solo tiene un maximo de 3.4028235E38
        System.out.println("Valor minimo Float: "+Float.MIN_VALUE);//valor minimo la cual puede almacenar el tipo Float
        System.out.println("Valor maximo Float: "+Float.MAX_VALUE);//valor maximo la cual puede almacenar el tipo Float
        
        double numeroDouble = 1.7976931348623157E308;//Aqui la funcion Double es directo y reconoce el numero real
        System.out.println("\nnumeroDouble = " + numeroDouble);//no nos dara el resultado deseado por que el tipo Double solo tiene un maximo de 1.7976931348623157E308
        System.out.println("Valor minimo Double: "+Double.MIN_VALUE);//valor minimo la cual puede almacenar el tipo Double
        System.out.println("Valor maximo Double: "+Double.MAX_VALUE);//valor maximo la cual puede almacenar el tipo Double
        
        return 0;
    }
        //COMO LA DECLARACION DE "VAR" RECONOCE EL TIPO DE VARIABLES 
    static int Variable_Var(){
        int numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        double numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        float numeroFloat = 10.0F;//las letras solo se pueden poner Long, Float y Double.
        System.out.println("numeroFloat = " + numeroFloat);
        
        return 0;
    }
        //TIPO CHAR
    static char Variable_char()
    {
        char mi_caracter = 'a';
        System.out.println("mi_caracter = " + mi_caracter);
        
        char Varchar = '\u0021';
        System.out.println("Varchar = " + Varchar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        //ahora lo hacemos pero con var
        char Varchar1 = '\u0021';
        System.out.println("/nVarchar1 = " + Varchar1);
        
        char varCharDecimal1 = 33;
        System.out.println("varCharDecimal1 = " + varCharDecimal1);
        
        char varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo1 = " + varCharSimbolo1);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        
        return 0;
    }
        //TIPO BOOLEAN
    static String Tipo_Boolean()
    {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La vandera es verdadera ");
        }else{
            System.out.println("La vandera es falsa ");
        }
        int edad = 10;
        //var esAdulto = edad>=18;
        if( edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        return null;
    }
        //CONVERTIIR STRING A UN NUMERO ENTERO 
    static int String_a_Entero()
    {
        //convertir un tipo string a un tipo int 
        int edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad+1));
        
        double ValorPI = Double.parseDouble("3.1416");
        System.out.println("ValorPI = " + ValorPI);
        
        //Pedir un valor 
        //CONVERTIMOS STRING A INT 
          Scanner consola = new Scanner(System.in);//Indicamos que trabajaremos con la consola
        System.out.print("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine()) ;//lee el valor de la consola que es tipo (String) y convertimos a entero 
        System.out.println(" Edad = " + edad);
        //CONVERTIMOS INT A STRING  
        System.out.print("Pon un numero entero: ");
        int Numero_Entero = Integer.parseInt(consola.nextLine());//LEE EL VALOR DE LA CONSOLA 
        System.out.println("\nNumero entero = " + Numero_Entero);
        String numero_String = String.valueOf(Numero_Entero);//convertimos el numero entero a String 
        System.out.println("Numero String = " +  numero_String);
        //CONVERTIR CHAR A STRING 
        char caracter = "Hola".charAt(0);//En la posicion 0 esta la H solo se puede imprimir un caracter 
        System.out.println("\ncaracter = " + caracter);
        System.out.print("\nProporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);//El valor de la consola de damos a la V.CARACTER y convertimos en char
        System.out.println("caracter = " + caracter);
        return 0;
    }
        //CONERSION Y IMPRESION DE TIPOS DE DATOS (TAREA)
    static String tareaTiendaDLibros(){
        //METODO DIRECTO SIN CONVERSION DATOS 
        Scanner consola=new Scanner(System.in);//Abrimos la consola para ingresar datos
        System.out.print("Proporciona el nombre: ");
        String nombre1 = consola.nextLine();//Leemos de tipo STRING 
        System.out.print("Proporciona el id: ");
        int id1 = consola.nextInt();//Leemos de tipo INT
        System.out.print("Proporciona el precio: ");
        double precio1 = consola.nextDouble();//Leemos de tipo DOUBLE
        System.out.print("Proporciona el envio gratuito: ");
        boolean envioGratuito1 = consola.nextBoolean();//Leemos de tipo BOOLEAN
        
        System.out.println("\n"+nombre1+" #"+id1);
        System.out.println("Precio: $"+precio1);
        System.out.println("Envio gratuito: "+envioGratuito1);
        
        //METODO CON CONVERSION DE DATOS 
        System.out.print("\n\nProporciona el nombre: ");
        String nombre = consola.nextLine();//Leemos caracteres de tipo STRING
        System.out.print("Proporciona el id: ");
        int id = Integer.parseInt(consola.nextLine());//Leemos de tipo STRING, pero convertimos a INT  
        System.out.print("Proporciona el precio: ");
        double precio = Double.parseDouble(consola.nextLine());//Leemos de tipo STRING, pero convertimos a DOUBLE
        System.out.print("Proporciona el envio gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());//Leemos de tipo STRING, pero convertimos a BOOLEAN
        
        System.out.println("\n"+nombre+" #"+id);
        System.out.println("Precio: $"+precio);
        System.out.println("Envio gratuito: "+envioGratuito);
        
        return null;
    }
        //OPERACIONES ARITMETICOS SUMA RESTA DIVISION MULTIPLICACION 
    static int operadoresAritmeticos(){
        int a=3, b=2;
        int resultado=a+b;
        System.out.println("resultado suma= " + resultado);
        
        resultado=a-b;
        System.out.println("resultado resta = " + resultado);
        
        resultado=a*b;
        System.out.println("resultado multiplicacion= " + resultado);
        
        float resultado2 = 3F / b ;//asignamos la F para   asignar que es un tipo flotante
        System.out.println("resultado division= " + resultado2);
        
        resultado=a%b;
        System.out.println("resultado residuo de la division = " + resultado);
        
        if (a%2 == 0){
            System.out.println("El numero 3 es par ");
        }else{
            System.out.println("El numero 3 es impar ");
        }
        return 0;
    }
        //OPERACIONES DE ASIGNACION EN JAVA
    static int operacionesAsignacion(){
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        a += 1;//a=a+1;
        System.out.println("a = " + a);
        a += 3;//a=a+3;
        System.out.println("a = " + a);
        a++;//a=a+1;
        System.out.println("a = " + a);
        a -= 2;
        System.out.println("a = " + a);
        
        //RECORDAR QUE TAMBIEN SE PUEDE *= /= %=
        
        return 0;
    }
        //OPERADORES UNARIOS 
    static int operadoresUnarios (){
        int a = 3;
        int b = -a;//cambiamos el signo de a 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento 
        //1. preincremento (simbolo  antes de la variable)
        int e = 3;
        int f = ++e;//primero se incrementa la variable e y se asigna a la variable f
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2. postincremento (simbolo despues de la variable)
        int g = 3;
        int h = g++;//primero se utiliza la varibiable g despues se incrementa en h 
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1. Predecremento
        int i = 2;
        int j = --i;// primero se resta despues se asigna el valor 
        
        System.out.println("i = " + i);//ya esta decremantada 
        System.out.println("j = " + j);
        
        //2. Posdecremento
        int k = 4;
        int l = k--;//k se asigna a l y el decremento se asigna a k
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
        return 0;
    }
    
        //OPERADORES DE ASIGNACION O RELACIONALES
    static int asignacionRelacionales(){
        int a = 3;
        int b = 2;
        
        boolean c = (a == b);
        System.out.println("c = " + c);
        
        boolean d = a != b;
        System.out.println("d = " + d);
        
        String cadena1 = "hola";
        String cadena2 = "adios";
        boolean e = cadena1 == cadena2;//se compara la referencia de objetos 
        boolean f = cadena1.equals(cadena2);// esta es la forma de comparar los datos de tipo String 
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        return 0;
    }
        //OPERADORES CONDICIONALES 
    static int  condicionales (){
        int a = -1;
        int min = 0;
        int max = 10;
        
        boolean resultado = a >= 0 && a <= 10;//si los dos son true es verdadero y si uno es false es falso.
        System.out.println("resultado = " + resultado);
        
        if (resultado == true ){
            System.out.println("Dentro de rango ");
        }else{
            System.out.println("Fuera de rango ");
        }
        
        boolean vacaciones = false;
        boolean DiaDescanso = false;
        
        if (vacaciones == true || DiaDescanso == true){//si las dos expreciones son false es falso y si uno de ellos es true es verdadero 
            System.out.println("El padre puede asistir al juego ");
        }else{
            System.out.println("El padre esta ocupado");
        }
                
        return 0;
    }
        //OPERADOR TERNARIO 
    static int operadorTernario(){
    
        boolean resultado;
        /*resultado = (3 > 2) ? "verdadero " : "falso"; // SI se cumple la condicion es verdadero y sino falso es como if y else
        System.out.println("resultado = " + resultado);// este el el operador ternario el ? y :
        */
        resultado = (3>2);
        if (resultado){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }
        int a = 7;
        if (a % 2 == 0){
            System.out.println(a+" =  es un numero par");
        }else{
            System.out.println(a+" =  es un numero impar");
        }
        return 0;
    }
        //PRECEDENCIA DE OPERADORES
    static int precedenciaOperadores(){
        
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        int resultado = 4 + 5 * 6 / 3;//evaluar la expresion de izquierda a derecha 4+(5*6)/3;
        System.out.println("resultado = " + resultado);//14
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        return 0;
    }
    
        //TAREA DE HALLAR AREA Y PERIMETRO
    static int areaPerimetro(){
        Scanner x=new Scanner(System.in);
        System.out.print("Proporciona el alto: ");
        int alto = x.nextInt();
        System.out.print("Proporciona el ancho: ");
        int ancho = x.nextInt();
        int Area = alto * ancho;
        int Perimetro = (alto+ancho)*2;
        System.out.println("Area = " + Area);
        System.out.println("Perimetro = " + Perimetro); 
        return 0;
    }
        //TAREA DE HALLAR EL NUMERO MAYOR 
    static int numeroMayor(){
        Scanner consola=new Scanner(System.in);
        System.out.print("Proporciona el numero1: ");
        int numero1 = consola.nextInt();
        System.out.print("Proporciona el numero2: ");
        int numero2 = consola.nextInt();
        if ( numero1 > numero2 ){
           System.out.println("El numero mayor es: "+numero1);
        }else{
            System.out.println("El numero mayor es: "+numero2);
        }
        return 0;
    }
        //COMO UTILIZAR LAS CONDICIONALES IF Y ELSE
    static int ifElse(){
        boolean condicion = true ;
        if (condicion){
            System.out.println("Condicion verdadera");
        }else{
            System.out.println("Condicion falsa");
        }
        
        //ejemplo covertir numero a letra
        Scanner x=new Scanner(System.in);
        int num = x.nextInt();
        String numText="Numero desconocido";
        
        if ( num == 1){
            numText = " numero uno";
        }else if (num == 2){
            numText = " numero dos";
        }else if (num == 3){
            numText = " numero tres";
        }else if (num == 3){
            numText = " numero cuatro";
        }else {
            numText = " numero no encontrado";
        }
        System.out.println("numText = " + numText);
        return 0;
    }
        //CALCULO DE ESTACION DEL AÑO  CON IF Y ELSE 
    static int estacionAño(){
        Scanner consola=new Scanner(System.in);
        System.out.print(" INGRESE EL Nro. DEL MES QUE ESTA: ");
        int mes = consola.nextInt();
        String estacion="Estacion desconocida";
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        }else if (mes == 3 || mes == 4 || mes ==5){
            estacion = "Primavera";
        }else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
        return 0;
    }
        //SENTENCIA DE CONTROL SWITCH
    static int sentenciaSwitch(){
        int num = 2;
        String numText = "numero desconocido";
        switch (num){
            case 1:
                numText = "numero uno";
                break;
            case 2:
                numText = "numero dos";
                break;
            case 3:
                numText = "numero tres";
                break;
            case 4:
                numText = "numero cuatro";
                break;
            default:
                numText = "caso no encontrado";
        }
        System.out.println("numText = " + numText);
        return 0;
    }
        //SENTENCIA DE CONTROL SWITCH EJEMPLOS DE ESTACION DEL AÑO
    static int  Ejemploswitch(){
        Scanner x=new Scanner (System.in);
        System.out.print(" INGRESE EL Nro DE MES QUE ESTA, PARA SABER LA ESTACION DEL AÑO: ");
        int mes = x.nextInt();
        String estacion = "estacion desconocida";
        
        switch (mes){
            case 1: case 2: case 12:
                estacion = "invierno";
                break;
            case 3: case 4: case 5:
                estacion = "primavera";
                break;
            case 6: case 7: case 8:
                estacion = "verano";
                break;
            case 9: case 10: case 11:
                estacion = "otoño";
                break;
                
        }
        System.out.println("estacion = " + estacion);
        
        return 0;
    }
        //TAREA DE IF, ELSE Y SWITCH
    static int tareaCondicional(){
        Scanner consola=new Scanner(System.in);
        System.out.print(" Proporciona un valor entre 0 y 10: ");
        int num = consola.nextInt();
        switch(num){
            case 9: case 10:
                System.out.println(" A");
                break;
            case 8:
                System.out.println(" B");
                break;
            case 7:
                System.out.println(" C");
                break;
            case 6:
                System.out.println(" D");
                break;
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println(" F");
                break;
            default:
                System.out.println(" Valor desconocido");
        }
        return 0;
    }
        //BUCLE while, DO WHILE Y FOR.
    static int bucleWhile(){
        
            //WHILE = MIENTRAS 
        int contador = 0;
        while(contador < 3){//Mientras la expresion sea verdadera se seguira ejecutando el programa
            System.out.println("contador = " + contador);
            contador++;//EJEM. contador = 0 entonces si cumple la condicion si es menor a 3 . por lo tanto es TRUE
        }//pero si contador = 3 entonces es FALSE y por lo tanto el bucle para
        System.out.println("\n\n");
        
        
            //DO = HACER , WHILE = MIENTRAS
        int contador2=0;
        do{//La diferencia con el WHILE es que el DO WHILE se ejecuta almenos 1 vez si o si.
            System.out.println("contador2 = " + contador2);
            contador2++;
        }while(contador2 < 3);
        System.out.println("\n\n");
        
        
            // FOR = PARA
        for (int contador3 = 0 ; contador3 < 3 ; contador3++ ){
            System.out.println("contador3 = " + contador3);//Es igual que WHILE se cumple la misma condicion true y false
        }//En este caso ya no es necesario implementar el contador 
        System.out.println("\n\n");
        
        
            //BREAK 
        //break rompe un ciclo 
        for (int contad = 0 ; contad < 3 ; contad++ ){
            if ( contad % 2 == 0){
                System.out.println("contad = " + contad);
                break;//El break para el ciclo que se esta ejecutando 
            }//En este caso con el break solo se imprimira el primer numero par, pero ya no el segundo.  
        }
        System.out.println("\n\n");  
        
        
            //CONTINUE
        for (int con = 0 ; con < 3 ; con++ ){
            if ( con % 2 != 0){
                continue; //CONTINUE NOS QUIERE DECIR QUE YA NO EJECUTARA DEL CICLO FOR LAS SIGUIENTES LINEAS SE OMITIRAN
            }//SE IRA A LA SIGUIENTE ITERRACCION
            System.out.println("con = " + con);
        }
        return 0;
    }
    
        //USO DE ETIQUETAS LABELS EN JAVA  
    static int  etiquetaLabel(){
        inicio:
        
        for (int con = 0 ; con < 3 ; con++ ){
            if ( con % 2 != 0){
                continue inicio; //EL INICIO NOS QUIERE DECIR QUE SE EJECUTARA DESDE LA EQTIQUETA INICIO
            }//CON INICIO SE IRA A LA LINEA DE EQTIQUETA AGREGADO
            System.out.println("con = " + con);
        }//ACLARAR QUE NO ES RECOMENDABLE UTILIZAR ESTE SINTAXIS
        return 0;//SIN EMBARGO SI SE PUEDE UTILIZAR EN CASOS DONDE HAY UN BUVLE DENTRO DE OTRO BUCLE
    }
    
    public static void main(String args[]) {
            etiquetaLabel();
            
            //JOptionPane.showMessageDialog(null,"Valor desconocido");
    }
}


 

