package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile(namaDepan: String, namaBelakang: String, umur: Int, status: Boolean): String {
    return "Nama Depan : $namaDepan, Nama Belakang : $namaBelakang, Umur : $umur, Status single? : $status"
} //done(?)


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    return listOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    var daftarAnggota = arrayOf("Alifian Akmal A.", "Aqil Jawadal F.", "Briyantama Wahab", "Clinton Dody H.B.", "I Desak Made A", "Wisnu Aryo S")
    val saya = daftarAnggota[1]
    return saya
} //done(?)

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5
    var resultTotal = mentor.size + countOfGroup
    return resultTotal
} //done(?)

fun main() {
//    latihan 1
    val showMyProfile = myProfile("Aqil", "Jawadal", 20, true)
    println("My Profile : $showMyProfile")
    println("================\n")

//    latihan 3
    val myName = myName()
    println("My Name is: $myName")
    println("================\n")

//    latihan 4
    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")
    println("================\n")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
//    latihan 2 & 5
    val showGroupDetail = groupDetail(2, listOf("Alifian Akmal A.", "Aqil Jawadal F.", "Briyantama Wahab", "Clinton Dody H.B.", "I Desak Made A", "Wisnu Aryo S"), "Morning")
    println(showGroupDetail)
    println("================\n")
//    woowwww rill done secara tidak sengaja XD
}