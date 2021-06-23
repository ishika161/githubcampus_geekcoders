N=int(input())
P=list()
for i in range(N):
    name=input()
    P.append(name)
noOfEvents=int(input())
M=list()
#User will input integer for particular query evaluation ie 1 for SERVE, 2 for FRIEND X Y, 3 for VIP X 

def finalQueue(N,P,M,X):
    if(M==1):
        print(SERVE(P))
    elif(M==2):
        print(FriendXY(P))
    elif(M==3):
        print(VIPX(P))
    else:
        print("Wrong choice entered")
            
            
def SERVE(P):
    P=P[1:]
    return P
def FriendXY(P):
    l=len(P)
    y=input()
    x=input()
    ind=-1
    for i in range(l):
        if(y==P[i]):
            index=i
            break
    for i in range(l):
        if(x==P[i]):
            ind=i
            break
    
    if(index>=0 and ind<0):
        P.append("9")
        for i in range(index+1,l):
            P[i+1]=P[i]
        P[index+1]=x
    elif(index<0 and ind>=0):
        for i in range(ind,l):
            P[i]=P[i+1]
        P=P[:l-2]
    return P
def VIPX(P):
    l=len(P)
    x=input()
    P.insert(0,x)
    return P
for i in range(noOfEvents):
    M=int(input("1 to Serve, 2 to Friend, 3 for Vip"))
    finalQueue(N,P,M,noOfEvents)
    
