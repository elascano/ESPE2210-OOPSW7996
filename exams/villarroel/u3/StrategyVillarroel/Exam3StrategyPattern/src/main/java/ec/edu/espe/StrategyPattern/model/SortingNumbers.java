package ec.edu.espe.StrategyPattern.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class SortingNumbers {
          private String unSorted[];
          private int size;
          private String sorted;

          public SortingNumbers(String[] unSorted, int size, String sorted) {
                    this.unSorted = unSorted;
                    this.size = size;
                    this.sorted = sorted;
          }
          
           public SortingNumbers() {
                    this.unSorted = null;
                    this.size = 0;
                    this.sorted = null;
          }


          

          /**
           * @return the unSorted
           */
          public String[] getUnSorted() {
                    return unSorted;
          }

          /**
           * @param unSorted the unSorted to set
           */
          public void setUnSorted(String[] unSorted) {
                    this.unSorted = unSorted;
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
          
}
