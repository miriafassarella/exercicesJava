import java.util.Arrays;

public class MetodoMain {

    public static void main(String[] args) {

	System.out.println(Arrays.toString(args));

	if (args.length <= 2) {

		System.out.printf("O array tem 2 ou menos argumentos, o elemento 2 é %s.%n", args[1]);
	}else {

		System.out.printf("O array tem mais de 2 elementos, o elemento 3 é %s.%n", args[2]);
	}

    }

//depois de compilar, teste : java MetodoMain argumento1 argumento2

//o resultado no console será : [argumento1, argumento2]
// para tirar a viergula entre dois elementos, adicionamos aspas : 
//ava MetodoMain "argumento1 argumento2"


}

