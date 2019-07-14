package leetcode

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object L112 {
  def hasPathSum(root: TreeNode, sum: Int): Boolean = {
    var find = false;
    traverse(root, 0, sum)

    def traverse(node: TreeNode, sum: Int, subject: Int): Unit = {
      if (find || node == null)
        return
      val newSum = sum + node.value
      if (node.left == null && node.right == null)
        if (newSum == subject)
          find = true
      traverse(node.left, newSum, subject)
      traverse(node.right, newSum, subject)
    }

    find
  }

  def hasPathSum2(root: TreeNode, sum: Int): Boolean = (root, sum) match{
    case (null, _) => false
    case (r, s) if r.left == null && r.right == null => r.value == sum
    case (r, s) => hasPathSum(r.left, sum - r.value) || hasPathSum(r.right, sum - r.value)
  }
}
