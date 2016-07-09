def text1 = ['caesar', 'died', 'in', 'march']
def text2 = ['the', 'long', 'march']


text1 = text1.unique { a, b -> a <=> b }//removes repeated datas
text2 = text2.unique { a, b -> a <=> b }//removes repeated datas

def common = text1.intersect(text2)//get intersection of text1 and text2
def collection = text1.plus(text2)//get union of text1 and text2

nCommon = common.size()//length of intersection 
nCollection = collection.size()//length of union

def jacardCoeff = nCommon/nCollection
print "The similirity of two text using jacardCoefficient is $jacardCoeff"