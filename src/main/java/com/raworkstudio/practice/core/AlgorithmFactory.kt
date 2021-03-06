package com.raworkstudio.practice.core

import com.raworkstudio.practice.bubblesort.BubbleSort
import com.raworkstudio.practice.heapsort.HeapSort
import com.raworkstudio.practice.insertionsort.InsertionSort
import com.raworkstudio.practice.quicksort.QuickSort
import com.raworkstudio.practice.sleepsort.SleepSort

/**
 * Created by Ivan Alburquerque on 7/3/2017.
 */
class AlgorithmFactory {

    companion object  {

        fun get(algorithm: AlgorithmTypes): Algorithm {

            when(algorithm) {
                AlgorithmTypes.BUBBLE_SORT -> return BubbleSort()
                AlgorithmTypes.INSERTION_SORT -> return InsertionSort()
                AlgorithmTypes.HEAP_SORT -> return HeapSort()
                AlgorithmTypes.QUICK_SORT -> return QuickSort()
                AlgorithmTypes.SLEEP_SORT -> return SleepSort()
            }
        }
    }

}