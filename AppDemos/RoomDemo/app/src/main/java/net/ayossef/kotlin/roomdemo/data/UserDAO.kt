package net.ayossef.kotlin.roomdemo.data

import androidx.room.*

@Dao
interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun addUser(newUser:User)

    @Update
    abstract fun modifyUser(newUserData:User)

    @Delete
    abstract fun removeUser(userToRemove:User)

    @Query("select * from user_tbl")
    abstract fun allUser():List<User>

    @Query("select * from user_tbl where name =:userName")
    abstract fun getUsersByName(userName:String):List<User>
}
