package com.example.backendcargotm.infrastructure.models

class Response<T> private constructor(val message: String, val code: Int, val data: T) {

    class Builder<T> {
        private var _message: String = ""
        private var _code: Int = 0
        private var _data: T? = null

        fun setMessage(message: String) = apply { this._message = message }
        fun setCode(code: Int) = apply { this._code = code }
        fun setData(data: T) = apply { this._data = data }

        fun build(): Response<T> {
            return Response(_message, _code, _data!!)
        }
    }
}
