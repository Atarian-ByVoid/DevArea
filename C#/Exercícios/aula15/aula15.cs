using System;

    class Aula15{

        static void Main(){

            int tempo=0;
            char select;

            Console.WriteLine("Itájuba/MG  ---  São Paulo/SP");
             Console.WriteLine("Esolha o meio de transporte: [o]ônibus  |   [c]carro");

             select=char.Parse(Console.ReadLine());

             switch(select){

                 case 'o':
                 tempo=600;
                 break;

                 case 'c':
                 tempo=400;
                 break;

                 default:
                 tempo=-1;
                 break;
                
             }

             if(tempo<0){
                 Console.WriteLine("Transporte indisponível");
             }else{
                 Console.WriteLine("Para o transporte escolhido é de {0} minutos",tempo);
             }


        }
    }
    