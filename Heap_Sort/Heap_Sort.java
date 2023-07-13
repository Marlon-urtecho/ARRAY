package Heap_Sort;

public class Heap_Sort {
	
	public void sort(int arr[]) {
        int n = arr.length;
        // para Construir el Heap osea (reorganizar matriz)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        // Extraer uno por uno los elementos del Heap
        for (int i = n - 1; i >= 0; i--) {
            // Mover el elemento actual de la raiz al final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Llamar a max heapify en el heap reducido
            heapify(arr, i, 0);
        }
    }

    // Para hacer heapify un subárbol enraizado con el nodo i que es
    // un índice en arr[]. n es el tamaño del heap
    void heapify(int arr[], int n, int i) {
        int largest = i; // Inicializar largest como root(Raiz)
        int l = 2 * i + 1; // izquierda = 2*i + 1
        int r = 2 * i + 2; // derecha = 2*i + 2
        // Si el hijo izquierdo es más grande que el root(Raiz)
        if (l < n && arr[l] > arr[largest])
            largest = l;
        // Si el hijo derecho es más grande que largest hasta ahora
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // Si largest no es root (Raiz)
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursivamente hacer heapify el subárbol afectado
            heapify(arr, n, largest);
        }
    }

}
