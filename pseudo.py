import sys;s=int(sys.argv[2]);t="";b=0
for l in open(sys.argv[1]):
 h=l;g=0
 for c in l:
  if c!=" ":break
  g+=1
 if g/s<b:h=" "*g+"}\n"+h;b-=1
 if l.strip().endswith(":"):h=l.split(":")[0];h+=" {";b+=1
 t+=h+"\n"
b-=1
while b>-1:
 t+=" "*(b*s)+"}\n";b-=1
print(t)
