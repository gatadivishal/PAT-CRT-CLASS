#def fact(n):
#   if n == 1 or n == 0:
#       return 1
 #  else:
 #      return n*fact(n-1)
#num = int(input())
#if num < 0:
#   print("factorail is not possible")
#else:
#   print(fact(num))
#def miss(a):
 #   l=[]
  #  for i in range(0,len(a)):
 #       p=i+1
 #       if (p < max(a)):
 #           l.append(p)
 #   return l
#a=[int(i) for i in input("Enter elements:").split()]
#print(miss(a))
#class Solution:
#   def runningSum(self, nums: l[int]) -> l[int]:
#        l=[]
#        for i in range(1,len(nums)+1):
#            sum=0
#            for j in range(i):
#                sum=nums[j]+sum
#            l.append(sum)
#        return l
#t=int(input())
#for i in range(t):
#   n=int(input())
#   fact=1
#   while(n>0):
#      fact=fact*n
#      n=n-1
#   print(fact)
r=int(input())
for i in range(1,r+1):
    k=0
    for j in range(2,i//2+1):
        if(i%j==0):
            k=k+1
    if(k<=0):
        print(i)