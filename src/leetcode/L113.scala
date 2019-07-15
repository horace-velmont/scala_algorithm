package leetcode

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object L113 {
  def pathSum(root: TreeNode, sum: Int): List[List[Int]] = {

    def pathListSum(node: TreeNode, sum: Int, list: List[Int], listAll: List[List[Int]]): List[List[Int]] = {
      (node, sum) match {
        case (null, _) => List()
        case (r, s) if r.left == null && r.right == null => if (r.value == sum) (r.value :: list).reverse :: listAll else listAll
        case (r, s) => {
          pathListSum(r.left, sum - r.value, r.value :: list, listAll) ::: pathListSum(r.right, sum - r.value, r.value :: list, listAll) ::: listAll
        }
      }
    }

    pathListSum(root, sum, List(), List())
  }
}
