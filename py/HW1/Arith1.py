class Exp():
	def __init__(self):
		pass
	def eval(self):
		pass

class AddExp(Exp):
	def __init__(self, e1, e2):
		self.e1 = e1
		self.e2 = e2
		pass
	def eval(self):
		return self.e1.eval() + self.e2.eval()
		pass

class IntExp(Exp):
	def __init__(self, val):
		self.val = val
		pass

	def eval(self):
		return self.val
		pass

class MulExp(Exp):
	def __init__(self, e1, e2):
		self.e1 = e1
		self.e2 = e2
		pass
	def eval(self):
		return self.e1.eval() * self.e2.eval()
		pass

class SubExp(Exp):
	def __init__(self, e1, e2):
		self.e1 = e1
		self.e2 = e2
		pass
	def eval(self):
		return self.e1.eval() - self.e2.eval()
		pass


if __name__ == "__main__":
	num_neg1 = IntExp(-1)
	num_1 = IntExp(1)
	num_2 = IntExp(2)
	num_3 = IntExp(3)
	
	assert num_1.eval() == 1
	assert num_neg1.eval() == -1

	assert AddExp(num_1, num_1).eval() == 2
	assert AddExp(num_1, MulExp(num_2, num_3)).eval() == 7
	assert SubExp(num_1, num_1).eval() == 0


