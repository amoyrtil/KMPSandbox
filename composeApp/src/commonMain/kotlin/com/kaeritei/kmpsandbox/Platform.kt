package com.kaeritei.kmpsandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform