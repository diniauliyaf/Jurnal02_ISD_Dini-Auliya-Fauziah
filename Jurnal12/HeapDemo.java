import java.util.PriorityQueue;
import java.util.Scanner;

class MinHeap {
    private PriorityQueue<ListPriority> heap;

    public MinHeap() {
        heap = new PriorityQueue<>();
    }

    public void add(ListPriority lp) {
        heap.add(lp);
    }

    public ListPriority remove() {
        return heap.poll();
    }

    public int size() {
        return heap.size();
    }

    public ListPriority peek() {
        return heap.peek();
    }
}

class ListPriority implements Comparable<ListPriority> {
    private int priority;
    private String description;

    public ListPriority(int aPriority, String aDescription) {
        priority = aPriority;
        description = aDescription;
    }

    public String toString() {
        return "Task terdekat yang harus diselesaikan: " + description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public int compareTo(ListPriority other) {
        return Integer.compare(this.priority, other.priority);
    }
}

public class HeapDemo {
    public static void main(String[] args) {
        MinHeap q = new MinHeap();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tugas dalam format 'priority, description'. Ketik 'DONE' jika selesai:");

        while (true) {
            System.out.print("Masukkan tugas: ");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "DONE":
                    if (q.size() > 0) {
                        ListPriority task = q.remove();
                        System.out.println(task);
                        System.out.println(task.getDescription() + " selesai dilaksanakan, berikutnya tugas: ");
                        if (q.size() > 0) {
                            ListPriority nextTask = q.peek();
                            System.out.println(nextTask.getDescription());
                        } else {
                            System.out.println("Tidak ada tugas tersisa.");
                        }
                    } else {
                        System.out.println("\nTidak ada tugas dalam antrian.");
                    }
                    scanner.close();
                    return;
                default:
                    String[] parts = input.split(", ", 2);
                    if (parts.length < 2) {
                        System.out.println("Masukan tidak valid. Harap masukkan prioritas dan deskripsi.");
                    } else {
                        String priorityString = parts[0];
                        String description = parts[1];

                        try {
                            int priority = Integer.parseInt(priorityString);
                            q.add(new ListPriority(priority, description));
                        } catch (NumberFormatException e) {
                            System.out.println("Prioritas tidak valid. Harap masukkan prioritas numerik.");
                        }
                    }
                    break;
            }
        }
    }
}