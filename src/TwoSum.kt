class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var i = 0
        var j = 1
        var found = false
        var ret = IntArray(2)

        while(i < nums.size-1 && !found){
            while(j < nums.size && !found){
                if(nums[i] + nums[j] == target){
                    ret[0] = i
                    ret[1] = j
                    found = true
                } else {
                    j++
                }
            }
            i++
            j = i+1
        }
        return ret
    }
}

fun main(){
    var twoSum = TwoSum()
    var array = intArrayOf(3,2,4)
    twoSum.twoSum(array,6)
}