```mongo

  > show dbs
  > use mydb
  > show collections
  > db.createCollection('person')
  > db.person.insert({name: 'person1', phone: '+9122244', city: 'Pune', email: 'person1@test.com'})
  > db.stats()
  > db.employees.drop()
  > db.dropDatabase()
  > db.person.insertMany([{ name: 'person2', email: 'person2@test.com' }, { name: 'person3', phone: '+112334234'}])
  > db.product.insertMany([
    { title: 'phone1', cpu: 'Qualcomm 845', price: 40000, company: 'xyz' },
    { title: 'adidas shoes', price: 4000, company: 'adidas' }
  ])

  > db.emp.find().hasNext()
  > db.emp.find().next()
  > db.emp.find().skip(3)
  > db.emp.find().limit(3)
  > db.emp.find().count()
  > db.emp.find().toArray()
  > db.emp.find().forEach(item => {
    print(item.ename)
    print(item.job)
  })

  > db.emp.find().forEach(item => {
    print(`salary: ${item.sal} -> bonus: ${item.sal * 0.10}`)
  })

  > db.emp.find().sort( {sal: 1})
  > db.emp.find().sort( {sal: 1, deptno: 1})

  > for (let index = 0; index < 100; index++ ) {
    db.temp.insert({ name: 'person-' + index, city: 'pune' })
  }

  > db.emp.find({_id: 7654})

  > db.mobiles.update({ _id: ObjectId("5fd4fbc9e1981eb38c4ab80d")}, { price: 16000 })
  > db.mobiles.update({ _id: ObjectId("5fd4fbc9e1981eb38c4ab80d")}, { $set: { price: 16000 }})
```