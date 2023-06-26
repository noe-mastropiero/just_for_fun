import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class functions {

    public void reverseaString(String s) {

        String complete = "";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            complete = sb.append(s.charAt(i)).toString();
        }
        System.out.println(complete);
    }

    public void promedioLista(List<Integer> list) {
        int total = list.size();
        float sum = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            sum = sum + list.get(i);
        }
        System.out.println("promedio: " + sum / total);
    }

    public void promedioListaConFunciones(List<Integer> list) {
        Double s = list.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println(s);
    }

    public void multiplode3y5(Integer top) {
        for (int i = 1; i <= top; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz " + i);
            }
        }
        System.out.println(top);
    }

    public void intercambioLista(List<Integer> list) {
        int[] numeros = {2, 5, 50, 7, 25, 9, 8};
        int pos2 = numeros[2];
        int pos4 = numeros[4];

        for (int i = 0; i <= numeros.length - 1; i++) {
            list.add(i, numeros[i]);
        }
        System.out.println("lista original: " + list.toString());
        System.out.println(pos2);
        System.out.println(pos4);
        list.remove(2);
        list.remove(4);
        list.add(2, pos4);
        list.add(4, pos2);

        System.out.println("lista cambiada: " + list.toString());
    }

    public void eliminarRepetidosDeList() {
        List<Integer> numeros = new ArrayList<>();
        int[] agregar = {1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 0, 0};

        for (int i = 0; i <= agregar.length - 1; i++) {
            numeros.add(i, agregar[i]);
        }

        System.out.println(numeros);
        Set<Integer> sinDuplicados = new LinkedHashSet<>(numeros);
        numeros.clear();
        numeros.addAll(sinDuplicados);

        System.out.println(numeros);
    }

    public void fibonacci() {

        int max = 25;
        int num1 = 1;
        int num2 = 1;
        int suma = 0;
        System.out.print(num1 + ", ");

        for (int i = 0; i <= max; i++) {
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            System.out.print(suma + ", ");

        }

    }

    public void escaleraDeNumeros() {
        int altura = 5;

        for (int k = 1; k <= altura; k++) {
            for (int i = 1; i <= k; i++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public void dibujaPiramide(int altura) {
        for (int numeroespacios = altura, numeroasteriscos = 1; numeroasteriscos <= (altura * 2) - 1; numeroespacios--, numeroasteriscos += 2) {
            for (int i = 0; i < numeroespacios; i++) {
                System.out.print(" ");
            }
            for (int j = numeroasteriscos; j != 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void llenarArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("array de cuantas pósiciones = ");
        int pos = sc.nextInt();
        int[] arry = new int[pos];
        int ctu = 0;
        Random ran = new Random();


        for (int i = 0; i <= pos - 1; i++) {
            int num = ran.nextInt(10);
            arry[i] = num;
        }
        for (int c = 0; c <= arry.length - 1; c++) {
            System.out.println("en el indice " + ctu + " valor " + arry[c]);
            ++ctu;
        }
    }

    public void arrayencriptado() {
        Scanner sc = new Scanner(System.in);

        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }

        String cadena = "";
        int eleccion = -1;

        do {
            System.out.println("Elija un indice entre 0 y " + (mayusculas.length - 1));
            eleccion = sc.nextInt();

            if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
                System.out.println("Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }

        } while (eleccion != -1);

        System.out.println(cadena);

    }

    public void ordenaBurbuja(int[] lista){
        int cuentaintercambios=0; //Variable que cuenta los intercambios que hacemos
        for (boolean ordenado=false;!ordenado;){ //hasta que no haya mas intercambios no sales
            for (int i=0;i<lista.length-1;i++){ if (lista[i]>lista[i+1]){
                //intercambio
                int variableauxiliar=lista[i];
                lista[i]=lista[i+1];
                lista[i+1]=variableauxiliar;
                //indico que ha habido un intercambio mas
                cuentaintercambios++;
            }
            }
            //Si no hay intercambios, el array esta ordenado
            if (cuentaintercambios==0){
                ordenado=true;
            }
            cuentaintercambios=0; //Reinicio la variable
        }
    }

    public void patronBurbuja(int[] arr){
        int aux= 0;
        for(int i =0; i< arr.length; i++){
            for(int k=i+1; k<arr.length; k++){
                if(arr[k]<arr[i]){
                    aux = arr[i];
                    arr[i] = arr[k];
                    arr[k] = aux;
                }
            }
        }
        System.out.println("el numero mayor del array es: "+aux);
    }

    public void leerFichero(){
        final String fichero = "C:\\Users\\noe.cardenas\\Documents\\prueba.txt";

        try(FileReader fr = new FileReader(fichero)){
            int valor = fr.read();

            while(valor != -1){
                if(valor!= 32){
                    System.out.print((char)valor);
                }
                valor =fr.read();
            }
        }catch(IOException e){
            System.out.println("problemas con el fichero "+e);
        }

    }
    public void numerArmstrong(int num){
        int suma = 0;
        int numero = num;
        int numeroOriginal = num;
        String Ntostring = Integer.toString(numero);
        int digitos = Ntostring.length();
        int ultimoDigito;

        while(numero>0){
            ultimoDigito = numero%10;
            suma = (int) (suma+Math.pow(ultimoDigito,digitos));
            numero = numero/10;
        }

        if(numeroOriginal ==suma){
            System.out.println("es armstrong");
        }else {
            System.out.println("NO es armstrong");
        }

    }

    public void numeroPerfecto(int nu){
        int numero = nu;
        int suma = 0;
        int i =1;

        do{
            if(numero%i==0){
                suma = suma+i;
            }
            i++;
        }while(i<=numero/2);

        if(suma == numero){
            System.out.println("es perfecto");
        }else{
            System.out.println("NO es perfecto");
        }

    }

    public void buscarUnChar(){
        String str = "en un lugar de la mancha de cuyo nombre no quiero acordarme".replaceAll("\\s","");
        char abuscar = 'c';
        int ctu=0;
        HashMap<Character,Integer> hmap = new HashMap<>();

        for(int i =str.length()-1; i>=0; i-- ){
            if(str.charAt(i) == abuscar){
                ctu++;
                hmap.put(abuscar, ctu);
            }
        }
        System.out.println("se encontraron: "+ctu+" veces el char: "+abuscar);
        System.out.println(hmap);

    }

    public void contarCharEnString(){
        String str= "lolo,".replaceAll("\\s","");
        HashMap <Character,Integer> hmap = new HashMap<>();

        for(int i=str.length()-1; i>=0;i--){
            if(hmap.containsKey(str.charAt(i))){
                int ctu = hmap.get(str.charAt(i));
                hmap.put(str.charAt(i),++ctu);
            }else{
                hmap.put(str.charAt(i),1);
            }
        }
        System.out.println(hmap);
    }

    public void comparadorDeArrays() {
        //String str1 = "en un lugar de la mancha de cuyo nombre no quiero acordarme".replaceAll("\\s", "");
        //String str2 = "en un lugar de la manha de cuyo nombre no quiero acoradarme".replaceAll("\\s", "");
        String str1 = "ava".replaceAll("\\s", "");
        String str2 = "ave".replaceAll("\\s", "");

        ArrayList <Character> corr1 = new ArrayList<>();
        ArrayList <Character> corr2 = new ArrayList<>();

        for(int i = 0; i<=str1.length(); i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    corr1.add(str1.charAt(i));
                    corr2.add(str2.charAt(i));

               }else{
                    char up = Character.toUpperCase(str1.charAt(i));
                    corr1.add(str1.charAt(up));
                    corr2.add(str2.charAt(i));
                }
        }
        System.out.println(corr1.toString());
        System.out.println(corr2.toString());

    }







    }



