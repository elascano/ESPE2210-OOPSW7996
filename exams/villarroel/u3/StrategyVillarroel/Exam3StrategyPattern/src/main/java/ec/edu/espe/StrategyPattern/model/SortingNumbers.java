package ec.edu.espe.StrategyPattern.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class SortingNumbers {
          private String unsorted;
          private int size;
          private String sorted;
          private String sortAlgoritm;

          public SortingNumbers(String unSorted, int size, String sorted, String sortAlgoritm) {
                    this.unsorted = unSorted;
                    this.size = size;
                    this.sorted = sorted;
                    this.sortAlgoritm = sortAlgoritm;
          }

          
          
           public SortingNumbers() {
                    this.unsorted = null;
                    this.size = 0;
                    this.sorted = null;
                    this.sortAlgoritm = "Insertion Sort";
          }


          

          /**
           * @return the unSorted
           */
          public String getUnSorted() {
                    return unsorted;
          }

          /**
           * @param unSorted the unSorted to set
           */
          public void setUnSorted(String unSorted) {
                    this.unsorted = unSorted;
          }

          /**
           * @return the size
           */
          public int getSize() {
                    return size;
          }

          /**
           * @param size the size to set
           */
          public void setSize(int size) {
                    this.size = size;
          }

          /**
           * @return the sorted
           */
          public String getSorted() {
                    return sorted;
          }

          /**
           * @param sorted the sorted to set
           */
          public void setSorted(String sorted) {
                    this.sorted = sorted;
          }

          /**
           * @return the sortAlgoritm
           */
          public String getSortAlgoritm() {
                    return sortAlgoritm;
          }

          /**
           * @param sortAlgoritm the sortAlgoritm to set
           */
          public void setSortAlgoritm(String sortAlgoritm) {
                    this.sortAlgoritm = sortAlgoritm;
          }
          
}
