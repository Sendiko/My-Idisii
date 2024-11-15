import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdt.myidisii.API.AuthResponse
import com.pdt.myidisii.API.LoginRequest
import com.pdt.myidisii.API.RegisterRequest
import com.pdt.myidisii.API.UrlClient
import com.pdt.myidisii.API.UserPreferences
import kotlinx.coroutines.launch

class MyIdisiliViewModel(context: Context) : ViewModel() {
    private val userPreferences = UserPreferences(context)

    var loginResponse: AuthResponse? = null
    var registerResponse: AuthResponse? = null

//    fun login(email: String, password: String, onResult: (AuthResponse) -> Unit) {
//        viewModelScope.launch {
//            val response = UrlClient.create(context).login(LoginRequest(email, password))
//            if (response.isSuccessful) {
//                loginResponse = response.body()
//                loginResponse?.token?.let {
//                    userPreferences.saveToken(it)
//                }
//                onResult(loginResponse!!)
//            }
//        }
//    }

//    fun register(name: String, email: String, password: String, onResult: (AuthResponse) -> Unit) {
//        viewModelScope.launch {
//            val response = UrlClient.create(context).register(RegisterRequest(name, email, password))
//            if (response.isSuccessful) {
//                registerResponse = response.body()
//                onResult(registerResponse!!)
//            }
//        }
//    }
}
