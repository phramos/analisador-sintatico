struct fauno{
    int altura;
    float peso;
    char sexo = 'M';
};

int variavelglobal;

int main(char args) {
    float a = 666;
    float b;
    float c = 10.0E56;


    while (a != b) {
        if (a == b) {
            a = b - 1;
        } else {
            b = a + 1;
        }
    }

    c = a + b - 35;

    /*ERRO AQUI - falta o ;*/
    return 0
}

