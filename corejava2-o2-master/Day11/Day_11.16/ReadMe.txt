```sql
DELIMITER $$
CREATE PROCEDURE sp_insert_book( 
pBookId INT,
pSubjectName VARCHAR(100),
pBookName VARCHAR(100),
pAuthorName VARCHAR(100),
pPrice FLOAT )
BEGIN
    INSERT INTO BookTable 
    VALUES
    (
        pBookId,
        pSubjectName,
        pBookName,
        pAuthorName,
        pPrice
    );
END$$
DELIMITER ;
```


```sql
DELIMITER $$
CREATE PROCEDURE sp_update_book( 
pPrice FLOAT,
pBookId INT
)
BEGIN
    UPDATE BookTable
    SET price = pPrice
    WHERE
    book_id = pBookId;
END$$
DELIMITER ;
```

```sql
DELIMITER $$
CREATE PROCEDURE sp_delete_book( pBookId INT )
BEGIN
    DELETE 
    FROM BookTable
    WHERE
    book_id = pBookId;
END$$
DELIMITER ;
```

```sql
DELIMITER $$
CREATE PROCEDURE sp_find_book( pBookId INT )
BEGIN
    SELECT
    *
    FROM BookTable
    WHERE
    book_id = pBookId;
END$$
DELIMITER ;
```

```sql
DELIMITER $$
CREATE PROCEDURE sp_get_books(  )
BEGIN
    SELECT
    *
    FROM BookTable;
END$$
DELIMITER ;
```