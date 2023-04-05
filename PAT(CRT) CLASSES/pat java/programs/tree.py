class Node:
    def init(self,value):
        self.data=value
        self.left=None
        self.right=None
class Tree:
    def add_ele(self,root,value):
        new_node=Node(value)
        if value<root.data:
            if root.left==None:
                root.left=new_node
            else:
                self.add_ele(root.left,value)
        else:
            if root.right==None:
                root.right=new_node
            else:
                self.add_ele(root.right,value)

    def inorder(self,root):
        if root.left!=None:
            self.inorder(root.left)
        print(root.data,end=" ")
        if root.right!=None:
            self.inorder(root.right)

    def preorder(self,root):
        print(root.data,end=" ")
        if root.left!=None:
            self.preorder(root.left)
        if root.right!=None:
            self.preorder(root.right)
    
    def postorder(self,root):
        if root.left!=None:
            self.postorder(root.left)
        if root.right!=None:
            self.postorder(root.right)
        print(root.data,end=" ")
    
    def levelorder(self,root):
        q=[root]
        while len(q)!=0:
            ele=q.pop(0)
            print(ele.data,end=' ')
            if ele.left!=None:
                q.append(ele.left)
            if ele.right!=None:
                q.append(ele.right)
    #ADD left and right subtree and multiply them together
    def sum(self,root):
        res=root.data
        if root.left!=None:
            res+=self.sum(root.left)
        if root.right!=None:
            res+=self.sum(root.right)
        return res
    
    def height(self,root):
        if root==None:
            return -1
        left_height = self.height(root.left)
        right_height = self.height(root.right)
        return 1+max(left_height,right_height)
ob=Tree()
root=Node(10)
ob.add_ele(root,5)
ob.add_ele(root,15)
ob.add_ele(root,2)
ob.add_ele(root,6)
ob.add_ele(root,12)
ob.add_ele(root,17)
ob.inorder(root)
print()
ob.preorder(root)
print()
ob.postorder(root)
print()
ob.levelorder(root)
print()
print(ob.sum(root.left)*ob.sum(root.right))
print()