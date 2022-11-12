using System;

class Aula12{

    static void Main(){


        double n1,n2,n3,n4,notaTotal;
notaTotal=n1=n2=n3=n4=0;
string resultado="Reprovado";

        Console.WriteLine("Digite a nota 1: ");
        n1=double.Parse(Console.ReadLine());
          Console.WriteLine("Digite a nota 2: ");
        n2=double.Parse(Console.ReadLine());
          Console.WriteLine("Digite a nota 3: ");
        n3=double.Parse(Console.ReadLine());
          Console.WriteLine("Digite a nota 4: ");
        n4=double.Parse(Console.ReadLine());


        notaTotal=n1+n2+n3+n4;
 

        if((notaTotal)>=60){
            resultado="Aprovado";

        }
        Console.WriteLine("Nota total: {0}    -   Resultado: {1}",notaTotal,resultado);

     
}
}