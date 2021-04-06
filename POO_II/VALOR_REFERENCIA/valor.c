#include<stdio.h>

void doblar(int);
int variable_global = 2; 

int main () {
    printf("Valor de la variable antes de llamar al método %d\n", variable_global);
    doblar(variable_global);
    printf("Valor de la variable después de llamar al método %d\n", variable_global);
    return 0;
}
void doblar (int variable) {
    printf("Valor de la variable en el método antes de computar %d\n", variable);
    variable *= 2;
    printf("Valor de la variable en el método despúes de computar %d\n", variable);
}

